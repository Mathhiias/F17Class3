/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3w17;

import java.time.LocalDate;

/**
 *
 * @author mathi
 */
public class PayCheque {
    private String employeeName, notes;
    private double amount;
    LocalDate dateIssued;
    private int chequeNumber;
    
    private static int nextChequeNumber = 100;

    public PayCheque(String emplyeeName, String notes, double amount) {
        this.emplyeeName = emplyeeName;
        this.notes = notes;
        setPayAmount(amount);
        
        chequeNumber = nextChequeNumber;
        nextChequeNumber++;        
    }

    /**
     * This method will validate that the pay amount is > 0
     */
    private void setPayAmount(double amount)
    {
        if (amount>0)
            this.amount = amount;
        else
            throw new IllegalArgumentException("Pay amounts must be greater than 0");
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getNotes() {
        return notes;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDate getDateIssued() {
        return dateIssued;
    }

    public int getChequeNumber() {
        return chequeNumber;
    }
    
    public String toString()
    {
        return String.format("Cheque #:%d made out to %s for the amount of $%.2f",chequeNumber,employeeName,amount);
    }
}
