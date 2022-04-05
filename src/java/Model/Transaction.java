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
public class Transaction {
    
    private String transactionid;
    private String username;
    private String date;
    private String transaction_type;
    private String source_name;
    private String category_name;
    private String details;
    private float amount;

    public Transaction(float amount) {
        this.amount = amount;
    }

    public Transaction(String username, String date, String transaction_type, String source_name, String category_name, float amount,String details) {
        this.username = username;
        this.date = date;
        this.transaction_type = transaction_type;
        this.source_name = source_name;
        this.category_name = category_name;
        this.details = details;
        this.amount = amount;
    }
    
    public Transaction(String transactionid, String username, String date, String transaction_type, String source_name, String category_name, String details, float amount) {
        this.transactionid = transactionid;
        this.username = username;
        this.date = date;
        this.transaction_type = transaction_type;
        this.source_name = source_name;
        this.category_name = category_name;
        this.details = details;
        this.amount = amount;
    }

    public Transaction(String date, String transaction_type, String source_name, String category_name, String details, float amount) {
        this.date = date;
        this.transaction_type = transaction_type;
        this.source_name = source_name;
        this.category_name = category_name;
        this.details = details;
        this.amount = amount;
    }

    public Transaction(String date, String source_name, String category_name, String details, float amount) {
        this.date = date;
        this.source_name = source_name;
        this.category_name = category_name;
        this.details = details;
        this.amount = amount;
    }

    public Transaction(String transactionid, String username, String date, String source_name, String category_name, String details, float amount) {
       this.transactionid = transactionid;
        this.username = username;
        this.date = date;
        this.source_name = source_name;
        this.category_name = category_name;
        this.details = details;
        this.amount = amount; 
    }
    
    public String getTransactionid() {
        return transactionid;
    }

    public void setTransactionid(String transactionid) {
        this.transactionid = transactionid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTransaction_type() {
        return transaction_type;
    }

    public void setTransaction_type(String transaction_type) {
        this.transaction_type = transaction_type;
    }

    public String getSource_name() {
        return source_name;
    }

    public void setSource_name(String source_name) {
        this.source_name = source_name;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
    
    
}
