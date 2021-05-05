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
public class ExamResult {
    public void getExamStatus(int result) throws ArithmeticException {
        if(result<40){
            throw new ArithmeticException("you have failed in exam");
        }
        else{
            System.out.println("congratulations for your result: " + result);
        }
    }
}
