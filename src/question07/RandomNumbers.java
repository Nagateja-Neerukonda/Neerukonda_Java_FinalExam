/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question07;

import java.util.Scanner;

/**
 *
 * @author S542313
 */
public class RandomNumbers {

    public static void randomIntegers(int index) {

        int integerArray[] = new int[100];

        for (int i = 0; i < 100; i++) {

            integerArray[i] = (int) Math.floor(Math.random() * 100);

        }

        if (index >= 0 && index < 100) {

            System.out.print("entered value is at index: " + index);

            System.out.println(integerArray[index]);

        } else {

            System.out.println("entered value is Out Of Bounds.");

        }

    }

    public static void main(String[] args) {

        System.out.println("Question 7 by Nagateja Neerukonda.");
        // TODO code application logic here 
        Scanner scan = new Scanner(System.in);

        System.out.println("enter the index of an array");

        randomIntegers(scan.nextInt());

    }

}
