/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import static Controller.TransactionDAO.getConnection;
import Model.Budget;
import Model.Transaction;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author RyanLIM
 */
public class BudgetDAO {

    private static String jdbcURL = "jdbc:mysql://localhost:3306/moneysavingsystem";
    private static String jdbcUsername = "root";
    private static String jdbcPassword = "admin";

    private static final String SELECT_ALL_BUDGET = "select * from budget where username=?";
    private static final String SELECT_BUDGET_BY_ID = "select category_name,username,limit_amount from budget where category_name=? and username=?";
    private static final String UPDATE_TRANSACTION_SQL = "update budget set limit_amount=? where category_name=? and username=?";

    
    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }

    public Budget selectBudget(String category_name, String username) {
        Budget budget = null;
        try {
            Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement(SELECT_BUDGET_BY_ID);
            ps.setString(1, category_name);
            ps.setString(2, username);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Double limit_amount = rs.getDouble("limit_amount");

                budget = new Budget(category_name, username,limit_amount);

            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return budget;
    }

    public boolean updateBudget(Budget budget) throws SQLException {
        boolean rowUpdate = false;
        try {
            Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement(UPDATE_TRANSACTION_SQL);
            ps.setDouble(1, budget.getLimit_amount());
            ps.setString(2, budget.getCategory_name());
            ps.setString(3, budget.getUsername());

            System.out.println(ps);
            rowUpdate = ps.executeUpdate() > 0;

        } catch (SQLException e) {
            printSQLException(e);
        }
        return rowUpdate;
    }

        public List<Budget> selectAllBudget(String username) {
        List<Budget> budget = new ArrayList<>();
        try {
            Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement(SELECT_ALL_BUDGET);
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String category_name = rs.getString("category_name");
                Double limit_amount = rs.getDouble("limit_amount");

                budget.add(new Budget(category_name, username, limit_amount));
            }
        } catch (SQLException e) {
            printSQLException(e);
        }

        return budget;
    }
        
        
        
        
        
    
    private void printSQLException(SQLException ex) {
        for (Throwable e : ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }

}
