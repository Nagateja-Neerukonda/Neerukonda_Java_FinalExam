/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question02;

/**
 *
 * @author Nagateja Neerukonda
 */
public  class GeometricObject implements Colorable{
    
    private double sideOfSquare;
    private boolean color=true;
    
    public GeometricObject(double sideOfSquare) {
        this.sideOfSquare = sideOfSquare;
    }
   public double calculateArea(){
        return sideOfSquare*sideOfSquare;
    }
    @Override
    public void howToColor() {
        
        System.out.println("Color all four sides"); 
    }
    
    
}
