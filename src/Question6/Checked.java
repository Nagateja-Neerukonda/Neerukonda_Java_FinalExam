/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Nagateja Neerukonda
 */
public class Checked {
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        System.out.println("Since we dont have file we get exception");
       try{
           
            Scanner scan = new Scanner(new File("input.txt"));
            
       }catch(FileNotFoundException ff){
           System.out.println(ff.getMessage());
       }

    }
}
