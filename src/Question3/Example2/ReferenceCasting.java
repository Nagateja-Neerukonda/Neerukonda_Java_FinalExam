/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3.Example2;

/**
 *
 * @author S542313
 */
class ChargingPort {

    private int noOfPins;

    public ChargingPort(int noOfPins) {
        this.noOfPins = noOfPins;
    }

    public int getPins() {
        return this.noOfPins;
    }

    @Override
    public String toString() {
        return "ChargingPort{" + "noOfPins=" + noOfPins + '}';
    }

}

class ExtesnionBox extends ChargingPort {

    private String typeOfBox;

    public ExtesnionBox(String typeOfBox, int noOfPins) {
        super(noOfPins);
        this.typeOfBox = typeOfBox;
    }

    @Override
    public String toString() {
        return "ExtesnionBox{" + "typeOfBox=" + typeOfBox + "   total pins are " + super.getPins();
    }

}

public class ReferenceCasting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Question 3 by Nagateja Neerukonda");
        // TODO code application logic here
        ExtesnionBox eb = new ExtesnionBox("Universal", 10);

        ChargingPort cp = eb; //implicit typecasting
        System.out.println("-----------------Implicit type casting");
        System.out.println(cp);

        System.out.println("------------------Explict Type Casting---------------------------");
        ExtesnionBox eb1 = (ExtesnionBox) cp;
        System.out.println(eb1);

    }

}
