/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question6;

/**
 *
 * @author S542313
 */
public class UnChecked {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] array1 = {21, 134, 75, 65, 234};
        System.out.println("Question 6 by Nagateja Nerrukonda");
        System.out.println("Printing exception");
        try {
            int x = array1[10];
            System.out.println(x);

        } catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println(ae.getMessage());
        }
    }
}
