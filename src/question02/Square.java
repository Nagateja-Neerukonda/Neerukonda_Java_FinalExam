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
public class Square extends GeometricObject implements Colorable {

    
    private boolean colorable;

    public Square(boolean colorable, double side) {
        super(side);
        this.colorable = colorable;
    }
    public boolean isColorable() {
        return colorable;
    }

    public Square(double side) {
        super(side);
    }
    @Override
    public double calculateArea(){
        return super.calculateArea();
    }
}
