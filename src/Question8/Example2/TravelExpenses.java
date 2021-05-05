/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question8.Example2;

/**
 *
 * @author Nagateja Neerukonda
 */
public class TravelExpenses {
    
    private int mealsPrice;

    public TravelExpenses(int mealsPrice) {
        this.mealsPrice = mealsPrice;
    }
    
    public int getMealsPrice(){
        if(mealsPrice>200){
            throw new IllegalArgumentException("Meals price is very high,,");
        }else{
            return (int) (mealsPrice-mealsPrice*0.1);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Question 8 by NagaTeja Neerukonda");
        try{
            TravelExpenses te=new TravelExpenses(100);
            System.out.println(te.getMealsPrice());
            TravelExpenses te1=new TravelExpenses(500);
            System.out.println(te1.getMealsPrice());
        }catch(IllegalArgumentException ie){
            System.out.println(ie.getMessage());
        }
        
   }
    
}
