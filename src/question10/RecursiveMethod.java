/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question10;

import java.util.Scanner;

/**
 *
 * @author S542313
 */
public class RecursiveMethod {

    public static int factorial(int facNum) {

        switch (facNum) {
            case 1:
                return 1;
            default:
                return (facNum * factorial(facNum - 1));//recursive call
        }

    }

    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number for clculating factorial.");

        int facNum = sc.nextInt();

        int num = factorial(facNum);
        
            System.out.println("Factorial of " + facNum + " is: " + num);
    }
}
