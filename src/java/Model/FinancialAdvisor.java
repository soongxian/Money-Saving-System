/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Blob;
import javax.servlet.http.Part;

/**
 *
 * @author RyanLIM
 */
public class FinancialAdvisor {
    int advisor_id;
    String advisor_pic;
    String advisor_name;
    String advisor_phone;
    String advisor_company;

    public FinancialAdvisor(int advisor_id, String advisor_pic, String advisor_name, String advisor_phone) {
        this.advisor_id = advisor_id;
        this.advisor_pic = advisor_pic;
        this.advisor_name = advisor_name;
        this.advisor_phone = advisor_phone;
    }
    
    public int getAdvisor_id() {
        return advisor_id;
    }

    public void setAdvisor_id(int advisor_id) {
        this.advisor_id = advisor_id;
    }

    public String getAdvisor_pic() {
        return advisor_pic;
    }

    public void setAdvisor_pic(String advisor_pic) {
        this.advisor_pic = advisor_pic;
    }

    public String getAdvisor_name() {
        return advisor_name;
    }

    public void setAdvisor_name(String advisor_name) {
        this.advisor_name = advisor_name;
    }

    public String getAdvisor_phone() {
        return advisor_phone;
    }

    public void setAdvisor_phone(String advisor_phone) {
        this.advisor_phone = advisor_phone;
    }
    
    
}
