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
public class GeometricDriver {

      /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Question 2 by Nagateja Neerukonda");
        GeometricObject[] arr = new GeometricObject[5];
        GeometricObject geo1 = new Square(true, 3.9);
        GeometricObject geo2 = new Square(false, 4.7);
        GeometricObject geo3 = new Square(true, 6.8);
        GeometricObject geo4 = new Square(false, 9.2);
        GeometricObject geo5 = new Square(true, 8.4);
        arr[0] = geo1;
        arr[1] = geo2;
        arr[2] = geo3;
        arr[3] = geo4;
        arr[4] = geo5;

        for (GeometricObject geoObj : arr) {
            Square s = (Square) (geoObj);
            if (s.isColorable()) {
                s.howToColor();
            } else {
                System.out.println("square is not colorable");

            }
            System.out.println("The Area of square is "+ s.calculateArea());
            System.out.println("***********");
        }

    }

}