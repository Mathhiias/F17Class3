/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3w17;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author mathi
 */
public class Employee {
    private String firstName, lastName;
    private int sinNum;
    private LocalDate birthDate;
    
    public Employee(String firstName, String lastName,int sinNum, LocalDate birthDate){
        this.firstName = firstName;
        this.lastName = lastName;
        this.sinNum = sinNum;
        setBirthday(birthDate);
        
        
    }
    
    /**
     * This will verify if the employee is 15-90 years old
     * @param birthDate 
     */
    private void setBirthday(LocalDate birthDate)
    {
        LocalDate today = LocalDate.now();
        int age = Period.between(birthDate, today).getYears();
        
        if (age>= 15 && age<=90)
            this.birthDate = birthDate;
        else
            throw new IllegalArgumentException("Employees must be 15-90 years old");
    }
    
    /**
     * This method will return a String to represent the full name of the employee
     */
    @Override
    public String toString()
    {
        return firstName + " " + lastName;
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public String getLastName()
    {
        return lastName;
    }
    
    public int getSinNumber()
    {
        return sinNum;
    }
}
