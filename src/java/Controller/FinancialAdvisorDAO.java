/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.FinancialAdvisor;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

/**
 *
 * @author RyanLIM
 */
public class FinancialAdvisorDAO {
    
    private static String jdbcURL = "jdbc:mysql://localhost:3306/moneysavingsystem";
    private static String jdbcUsername = "root";
    private static String jdbcPassword = "admin";
    
    private static final String FINANCIAL_ADVISOR_SQL = "SELECT * FROM financial_advisor";
    
    
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
        
            public List <FinancialAdvisor> selectAllAdvisor() throws IOException{
        List <FinancialAdvisor> advisor = new ArrayList <FinancialAdvisor>();
        try {
            Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement(FINANCIAL_ADVISOR_SQL);            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                int advisor_id = rs.getInt("advisor_id");
                Blob advisor_pic = rs.getBlob("advisor_pic");
                String advisor_name = rs.getString("advisor_name");
                String advisor_phone = rs.getString("advisor_phone");

                
                
                InputStream inputStream = advisor_pic.getBinaryStream();
                ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
                byte[] buffer = new byte[4096];
                int bytesRead = -1;
                 
                while ((bytesRead = inputStream.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, bytesRead);                  
                }
                 
                byte[] imageBytes = outputStream.toByteArray();
                String base64Image = Base64.getEncoder().encodeToString(imageBytes);
                 
                 
                inputStream.close();
                outputStream.close();
                
                advisor.add( new FinancialAdvisor(advisor_id,base64Image,advisor_name,advisor_phone));
                
            }
        } catch (SQLException e) {
             e.printStackTrace();
        }
        
        return advisor;
    }
}
