/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question9;

/**
 *
 * @author Nagateja Neerukonda
 */
public class BillDiscount {
    public void getBillDiscount(int billAmount){
        if(billAmount<100){
            throw new ArithmeticException("you have no discount for this bill");
        }
        else{
            System.out.println("Your discount amount is: " + billAmount*10/100);
        }
    }
}
