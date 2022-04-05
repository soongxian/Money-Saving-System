/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Budget;
import Model.Transaction;
import Model.User;
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
public class UserDAO {

    public int dao_transaction_id = 0;
    private static String jdbcURL = "jdbc:mysql://localhost:3306/moneysavingsystem";
    private static String jdbcUsername = "root";
    private static String jdbcPassword = "admin";

    private static final String INSERT_USER_SQL = "INSERT INTO moneysavingsystem.user (username ,name ,email ,password) VALUES (?,?,?,?)";
    private static final String SIGN_IN_SQL = "select * from user where username=? and password=?";
    private static final String DELETE_USER_SQL = "delete from user where username=?";
    private static final String SELECT_USER = "select username,name,email,password from user where username=?";
    private static final String UPDATE_USER_SQL = "update user set name=?,email=?, password=? where username=?";

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

    public int insertUser(User user) throws SQLException {
        int status = 0;
        try {
            Connection con = getConnection();

            PreparedStatement ps = con.prepareStatement(INSERT_USER_SQL);
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getName());
            ps.setString(3, user.getEmail());
            ps.setString(4, user.getPassword());

            status = ps.executeUpdate();
            

        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }

    public void userSQL(User user) throws SQLException {
        int status = 0;
        try {
            Connection con = getConnection();
            
            String sql = "INSERT INTO budget(category_name,username,limit_amount) VALUES ('Beauty',?,'0')";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, user.getUsername());
            ps.executeUpdate();
            
            sql = "INSERT INTO budget(category_name,username,limit_amount) VALUES ('Food',?,'0')";
            ps = con.prepareStatement(sql);
            ps.setString(1, user.getUsername());
            ps.executeUpdate();
            
            sql = "INSERT INTO budget(category_name,username,limit_amount) VALUES ('Gift',?,'0')";
            ps = con.prepareStatement(sql);
            ps.setString(1, user.getUsername());
            ps.executeUpdate();
            
            sql = "INSERT INTO budget(category_name,username,limit_amount) VALUES ('Health',?,'0')";
            ps = con.prepareStatement(sql);
            ps.setString(1, user.getUsername());
            ps.executeUpdate();
            
            sql = "INSERT INTO budget(category_name,username,limit_amount) VALUES ('Household',?,'0')";
            ps = con.prepareStatement(sql);
            ps.setString(1, user.getUsername());
            ps.executeUpdate();
            
            sql = "INSERT INTO budget(category_name,username,limit_amount) VALUES ('Self-development',?,'0')";
            ps = con.prepareStatement(sql);
            ps.setString(1, user.getUsername());
            ps.executeUpdate();
            
            sql = "INSERT INTO budget(category_name,username,limit_amount) VALUES ('Social Life',?,'0')";
            ps = con.prepareStatement(sql);
            ps.setString(1, user.getUsername());
            ps.executeUpdate();
            
            sql = "INSERT INTO budget(category_name,username,limit_amount) VALUES ('Other',?,'0')";
            ps = con.prepareStatement(sql);
            ps.setString(1, user.getUsername());
            ps.executeUpdate();
            }
  

         catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static User signInUser(String username, String password) {
        User user = null;
        try {
            Connection con = getConnection();

            PreparedStatement ps = con.prepareStatement(SIGN_IN_SQL);
            ps.setString(1, username);
            ps.setString(2, password);

            ResultSet result = ps.executeQuery();

            if (result.next()) {

                String name = result.getString("name");
                String email = result.getString("email");

                user = new User(username, name, email, password);
            }

            con.close();

        } catch (SQLException ex) {
        }
        return user;
    }

    public boolean deleteUser(String username) throws SQLException {
        boolean rowDeleted = false;
        try {
            Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement(DELETE_USER_SQL);
            ps.setString(1, username);
            rowDeleted = ps.executeUpdate() > 0;
        } catch (SQLException e) {
            printSQLException(e);
        }
        return rowDeleted;
    }

    public boolean updateUser(User user) throws SQLException {
        boolean rowUpdate = false;
        try {
            Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement(UPDATE_USER_SQL);
            
            ps.setString(1, user.getName());
            ps.setString(2, user.getEmail());
            ps.setString(3, user.getPassword());
            ps.setString(4, user.getUsername());

            System.out.println(ps);
            rowUpdate = ps.executeUpdate() > 0;

        } catch (SQLException e) {
            printSQLException(e);
        }
        return rowUpdate;
    }
    
        public User selectUser(String username) {
        User user = null;
        try {
            Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement(SELECT_USER);
            ps.setString(1, username);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String name = rs.getString("name");
                String email = rs.getString("email");
                String password = rs.getString("password");
                
                user = new User(username, name, email ,password);

            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return user;
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
