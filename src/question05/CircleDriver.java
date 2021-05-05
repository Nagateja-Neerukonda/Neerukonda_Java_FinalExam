/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question05;

/**
 *
 * @author S542313
 */
public class CircleDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("Question 5 by Nagateja Neerukonda");
        System.out.println("**********");
        ComparableCircle comCircle1 = new ComparableCircle(9.7);
        ComparableCircle comCircle2 = new ComparableCircle(9.7);

        System.out.println("The area of 1st circle is " + comCircle1.area());
        System.out.println("The area of 2nd circle is " + comCircle2.area());
        System.out.println("**********");
        
        if (comCircle1.compareTo(comCircle2) > 0) {
            System.out.println("Area of 1st circle is larger.");
        } else if (comCircle1.compareTo(comCircle2) < 0) {
            System.out.println("Area of 2nd circle is larger");
        } else {
            System.out.println("Area of ​​the 2 circles are same.");
        }
    }

}
