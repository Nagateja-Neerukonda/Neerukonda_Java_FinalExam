/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question8.Example1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Nagateja Neerukonda
 */
public class Encyclpedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException,IOException {
        // TODO code application logic here
        try{
            Scanner scan=new Scanner(new File("encli.txt"));  
        }
        catch(FileNotFoundException fe){
            System.out.println(fe.getMessage());
        }
        
    }
    
}
