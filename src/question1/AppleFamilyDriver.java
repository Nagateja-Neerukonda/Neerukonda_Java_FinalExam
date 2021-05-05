/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;

/**
 *
 * @author Nagateja Neerukonda
 */
 public class AppleFamilyDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Question 1 by Nagateja Neerukonda.");
        AppleFamily apple = new AppleFamily(2019, "iphone 12 pro","Apple","AppleFamily");
        AppleFamily nonApple = new AppleFamily(2018, "viv0 v7 plus","Vivo","NonAppleFamily");
        System.out.println(apple);
        System.out.println(apple.getMyParentToString());
        
        System.out.println(nonApple);
        System.out.println(nonApple.getMyParentToString());
    }

}

