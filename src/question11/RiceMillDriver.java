/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question11;

/**
 *
 * @author Nagateja Neerukonda
 */
public class RiceMillDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Question 11 by nagateja Neerukonda.");
        //Creating objects for Mosituriser class
        RiceMill rc1 = new RiceMill(200, "Ashiravad");
        RiceMill rc2 = new RiceMill(550, "Atta");
        RiceMill rc3 = new RiceMill(100, "Ashiravad");

        //We have rc1 and rc2 with same name "Ashiravad", In the RiceMill 
        //class we have  hashcode and equals method for industryName attribute hence if we use 
        // hashcode method on these objects we get same hashcode  
        System.out.println("Printing HashCodes");
        System.out.println(" ");
        System.out.println(rc1.hashCode());
        System.out.println(rc3.hashCode());
        System.out.println("The above two will have same hash codes!!!");
        System.out.println("Different Hash Code "+rc2.hashCode());

        /**
         * Though we are checking only industryName attribute even if the
         * processedWheatQuantityInTons is different it returns same hash code
         * ,but the objects are two new references hence their addresses are
         * different
         *
         */
        System.out.println("Checking '.equals' method");
        System.out.println(rc1.equals(rc3));
        //The above statements prints true since we have same Indutsryname.
        System.out.println(rc3.equals(rc2));
        // The above statement prints false because their Indutsrynames are different 
        // and having different references
        System.out.println(rc2.equals(rc1));
        //This  prints false.

    }

}
