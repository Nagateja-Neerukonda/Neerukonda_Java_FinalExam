/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3.Example1;

/**
 *
 * @author S542313
 */
public class PrimitiveCasting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Question 3 by Nagateja Neerukonda");
        // TODO code application logic here
        System.out.println("Showing implicit type casting");
        int a=10;
        System.out.println("The value of 'a' before conversion is "+ a);
        double converted=a;
        System.out.println("The value of a after conversion to double is "+ converted);
        System.out.println("---------------------------------------------------------------");
        System.out.println("Showing Explicit type casting");
        double dhamal=34.6;
        System.out.println("the value of 'dhamal' before conversion is "+ dhamal);
        int dhamlInt=(int)dhamal;
        System.out.println("the value of 'dhaml' after conversion is "+ dhamlInt);
        
        
    }
    
}
