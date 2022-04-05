/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.TransactionDAO;
import Model.Transaction;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author RyanLIM
 */
@WebServlet("/InsertExpenseServlet")
public class InsertExpenseServlet extends HttpServlet {

    TransactionDAO transactionDAO = new TransactionDAO();
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        String username = request.getParameter("username");
        String date = request.getParameter("date");
        String transaction_type = request.getParameter("transaction_type");
        String source_name = request.getParameter("source_name");
        String category_name = request.getParameter("category_name");
        String details = request.getParameter("details");
        Float amount = Float.parseFloat(request.getParameter("amount"));

        Transaction newTransaction = new Transaction(username,date, transaction_type, source_name, category_name, amount, details);
        int status = transactionDAO.insertExpenseTransaction(newTransaction);
        if (status > 0) {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<script>alert('Added Successfully');</script>");
            response.sendRedirect("ListTransactionServlet?month=0&year=0&username="+username);
        } else {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<script>alert('Failed to update transaction.');</script>");
            response.sendRedirect("ShowNewExpenseFormServlet?username="+username);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(InsertExpenseServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(InsertExpenseServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
