/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author RyanLIM
 */
public class Budget {

    String category_name;
    String username;
    double limit_amount;

    public Budget(String category_name, String username, double limit_amount) {
        this.category_name = category_name;
        this.username = username;
        this.limit_amount = limit_amount;
    }

    public Budget(){
        
    }
    
    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public double getLimit_amount() {
        return limit_amount;
    }

    public void setLimit_amount(double limit_amount) {
        this.limit_amount = limit_amount;
    }

    
}
