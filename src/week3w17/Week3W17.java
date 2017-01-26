/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3w17;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author mathi
 */
public class Week3W17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee emp1 = new Employee("Adam","Baum",1234,LocalDate.of(1977, Month.MARCH, 10));
        
        System.out.printf("The first employee is %s%n", emp1.toString());
    }
    
}
