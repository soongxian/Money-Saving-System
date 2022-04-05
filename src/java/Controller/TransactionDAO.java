/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Transaction;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author RyanLIM
 */
public class TransactionDAO {

    public int dao_transaction_id = 0;
    private static String jdbcURL = "jdbc:mysql://localhost:3306/moneysavingsystem";
    private static String jdbcUsername = "root";
    private static String jdbcPassword = "admin";

    private static final String INSERT_TRANSACTION_SQL = "INSERT INTO moneysavingsystem.transaction (transactionid ,username ,date ,transaction_type ,source_name ,category_name ,details ,amount) VALUES (?,?,?,?,?,?,?,?)";
    private static final String SELECT_ALL_TRANSACTION = "select * from transaction where username=? order by date desc";
    private static final String SELECT_TRANSACTION_BY_ID = "select transactionid,username,date,transaction_type,source_name,category_name,details,amount from transaction where transactionid=? and username=?";
    private static final String DELETE_TRANSACTION_SQL = "delete from transaction where transactionid = ? and username=?";
    private static final String UPDATE_TRANSACTION_SQL = "update transaction set date=?,source_name=?,category_name=?,details=?,amount=? where transactionid=? and username=?";

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

    public int insertExpenseTransaction(Transaction transaction) throws SQLException {
        int status = 0;
        try {
            Connection con = getConnection();
            dao_transaction_id++;
            String pattern = "00000";
            DecimalFormat myFormatter = new DecimalFormat(pattern);
            String output = myFormatter.format(dao_transaction_id);
            transaction.setTransactionid("TE" + output);

            PreparedStatement ps = con.prepareStatement(INSERT_TRANSACTION_SQL);
            ps.setString(1, transaction.getTransactionid());
            ps.setString(2, transaction.getUsername());
            ps.setString(3, transaction.getDate());
            ps.setString(4, transaction.getTransaction_type());
            ps.setString(5, transaction.getSource_name());
            ps.setString(6, transaction.getCategory_name());
            ps.setString(7, transaction.getDetails());
            ps.setDouble(8, transaction.getAmount());
            System.out.println(ps);
            status = ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }
        public int insertIncomeTransaction(Transaction transaction) throws SQLException {
        int status = 0;
        try {
            Connection con = getConnection();
            dao_transaction_id++;
            String pattern = "00000";
            DecimalFormat myFormatter = new DecimalFormat(pattern);
            String output = myFormatter.format(dao_transaction_id);
            transaction.setTransactionid("TI" + output);

            PreparedStatement ps = con.prepareStatement(INSERT_TRANSACTION_SQL);
            ps.setString(1, transaction.getTransactionid());
            ps.setString(2, transaction.getUsername());
            ps.setString(3, transaction.getDate());
            ps.setString(4, transaction.getTransaction_type());
            ps.setString(5, transaction.getSource_name());
            ps.setString(6, transaction.getCategory_name());
            ps.setString(7, transaction.getDetails());
            ps.setFloat(8, transaction.getAmount());
            System.out.println(ps);
            status = ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }
        
            public int insertTransferExpenseTransaction(Transaction transaction) throws SQLException {
        int status = 0;
        try {
            Connection con = getConnection();
            dao_transaction_id++;
            String pattern = "00000";
            DecimalFormat myFormatter = new DecimalFormat(pattern);
            String output = myFormatter.format(dao_transaction_id);
            transaction.setTransactionid("TQ" + output);

            PreparedStatement ps = con.prepareStatement(INSERT_TRANSACTION_SQL);
            ps.setString(1, transaction.getTransactionid());
            ps.setString(2, transaction.getUsername());
            ps.setString(3, transaction.getDate());
            ps.setString(4, transaction.getTransaction_type());
            ps.setString(5, transaction.getSource_name());
            ps.setString(6, transaction.getCategory_name());
            ps.setString(7, transaction.getDetails());
            ps.setDouble(8, transaction.getAmount());
            System.out.println(ps);
            status = ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }
        public int insertTransferIncomeTransaction(Transaction transaction) throws SQLException {
        int status = 0;
        try {
            Connection con = getConnection();
            dao_transaction_id++;
            String pattern = "00000";
            DecimalFormat myFormatter = new DecimalFormat(pattern);
            String output = myFormatter.format(dao_transaction_id);
            transaction.setTransactionid("TW" + output);

            PreparedStatement ps = con.prepareStatement(INSERT_TRANSACTION_SQL);
            ps.setString(1, transaction.getTransactionid());
            ps.setString(2, transaction.getUsername());
            ps.setString(3, transaction.getDate());
            ps.setString(4, transaction.getTransaction_type());
            ps.setString(5, transaction.getSource_name());
            ps.setString(6, transaction.getCategory_name());
            ps.setString(7, transaction.getDetails());
            ps.setFloat(8, transaction.getAmount());
            System.out.println(ps);
            status = ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }

    public Transaction selectTransaction(String transactionid, String username) {
        Transaction transaction = null;
        try {
            Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement(SELECT_TRANSACTION_BY_ID);
            ps.setString(1, transactionid);
            ps.setString(2, username);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String date = rs.getString("date");
                String transaction_type = rs.getString("transaction_type");
                String source_name = rs.getString("source_name");
                String category_name = rs.getString("category_name");
                String details = rs.getString("details");
                Float amount = rs.getFloat("amount");
                transaction = new Transaction(transactionid, username, date, transaction_type, source_name, category_name, details, amount);

            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return transaction;
    }

    public List<Transaction> selectAllTransaction(String username) {
        List<Transaction> transaction = new ArrayList<>();
        try {
            Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement(SELECT_ALL_TRANSACTION);
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String transactionid = rs.getString("transactionid");
                String date = rs.getString("date");
                String transaction_type = rs.getString("transaction_type");
                String source_name = rs.getString("source_name");
                String category_name = rs.getString("category_name");
                String details = rs.getString("details");
                Float amount = rs.getFloat("amount");
                transaction.add(new Transaction(transactionid, username, date, transaction_type, source_name, category_name, details, amount));
            }
        } catch (SQLException e) {
            printSQLException(e);
        }

        return transaction;
    }

    public boolean deleteTransaction(String transactionid, String username) throws SQLException {
        boolean rowDeleted = false;
        try {
            Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement(DELETE_TRANSACTION_SQL);
            ps.setString(1, transactionid);
            ps.setString(2, username);
            rowDeleted = ps.executeUpdate() > 0;
        } catch (SQLException e) {
            printSQLException(e);
        }
        return rowDeleted;
    }

    public boolean updateTransaction(Transaction transaction) throws SQLException {
        boolean rowUpdate = false;
        try {
            Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement(UPDATE_TRANSACTION_SQL);
            ps.setString(1, transaction.getDate());
            ps.setString(2, transaction.getSource_name());
            ps.setString(3, transaction.getCategory_name());
            ps.setString(4, transaction.getDetails());
            ps.setDouble(5, transaction.getAmount());
            ps.setString(6, transaction.getTransactionid());
            ps.setString(7, transaction.getUsername());
            
            System.out.println(ps);
            rowUpdate = ps.executeUpdate() > 0;

        } catch (SQLException e) {
            printSQLException(e);
        }
        return rowUpdate;
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
