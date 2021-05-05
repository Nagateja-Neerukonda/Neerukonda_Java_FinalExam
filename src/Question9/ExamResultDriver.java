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
public class ExamResultDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Question 9 eg 2 by Nagateja Neerukonda.");
        // TODO code application logic here
        ExamResult examResult = new ExamResult();
        try{
            examResult.getExamStatus(70);
            examResult.getExamStatus(30);
        }
        catch(ArithmeticException ae){
            System.out.println(ae.getMessage());
        }
        
    }
    
}
