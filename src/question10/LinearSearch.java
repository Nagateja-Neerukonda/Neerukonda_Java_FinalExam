/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question10;

import java.util.ArrayList;

/**
 *
 * @author Nagateja Neerukonda
 */
public class LinearSearch {

    public static int ListSearch(int start, int end, int value, ArrayList<Integer> valuessList) {

        if (end < start) {
            return -1;
        }
        if (valuessList.get(start) == value) {

            return start;
        }

        if (valuessList.get(end) == value) {
            return end;
        }
        // recursive call for this method 
        return ListSearch(start + 1, end - 1, value, valuessList);
    }

    public static void main(String[] args) {

        // TODO code application logic here         
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(500);
        arrayList.add(300);
        arrayList.add(400);
        arrayList.add(600);
        arrayList.add(800);

        int index = ListSearch(0, arrayList.size() - 1, 300, arrayList);

        if (index > -1) {

            System.out.println("Value present at index " + index);

        } else {

            System.out.println("No Value found");

        }

    }

}
