/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question9;

/**
 *
 * @author S542313
 */
public class BillDiscountDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Question 9 by Nagateja Neerukonda.");
        // TODO code application logic here
        BillDiscount bill = new BillDiscount();
        try{
            bill.getBillDiscount(110);
            bill.getBillDiscount(40);
        }
        catch(ArithmeticException ae){
            System.out.println(ae.getMessage());
        }
        
    }
    
}
