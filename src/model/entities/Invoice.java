/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.entities;

/**
 *
 * @author johab
 */
public class Invoice {

    private Double basicePayment;
    private Double tax;

    public Invoice() {
    }

    public Invoice(Double basicePayment, Double tax) {
        this.basicePayment = basicePayment;
        this.tax = tax;
    }

    public Double getBasicePayment() {
        return basicePayment;
    }

    public void setBasicePayment(Double basicePayment) {
        this.basicePayment = basicePayment;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }
    
    public Double getTotalPayment(){
        return getBasicePayment() - getTax();
    }

}
