/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question10;

import java.util.Scanner;

/**
 *
 * @author Nagateja Neerukonda
 */
public class FibnocciRecursion {

    static int fibNum(int n) {

        if (n != 0) {
            if (n == 1) {
                return 1;
            } else {
                return fibNum(n - 1) + fibNum(n - 2); //recursive call
            }
        } else {
            return 0;
        }

    }
    
    public static int sumOfNum(int num) {

        if (num == 1) {

            return 1;

        } else {

            return num + sumOfNum(num); //infinite recursive call

        }
    }
        /**
         * @param args the command line arguments
         */
    public static void main(String[] args) {

        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number for clculating fibnocciNum.");

        int fibnocciNum = sc.nextInt();
        System.out.println("The First " + fibnocciNum + " fibnocci numbers are: ");
        for (int i = 0; fibnocciNum >= i; i++) {
            System.out.print(fibNum(i) + " ");
        }
        
        System.out.println("sum of numbers of 10 is"+ sumOfNum(10));
    }

}
