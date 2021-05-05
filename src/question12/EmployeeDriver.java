/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author S542313
 */
public class EmployeeDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("");
        // TODO code application logic here
        ArrayList<Employee> eList = new ArrayList<>();
        Employee employ1 = new Employee(103, "Wanda Maximoff", 159900);
        Employee employ2 = new Employee(90, "Strange Doctor", 120000);
        Employee employ3 = new Employee(763, "Mark Ruffalo", 250000);
        Employee employ4 = new Employee(201, "Natalie Portman", 90000);
        Employee employ5 = new Employee(1097, "Scarlet jhonson", 130000);
        Employee employ6 = new Employee(764, "Vision", 950000);
        eList.add(employ1);
        eList.add(employ2);
        eList.add(employ3);
        eList.add(employ4);
        eList.add(employ5);
        eList.add(employ6);
        System.out.println("Deafult Order");
        listDisplay(eList);
        Collections.sort(eList);
        System.out.println("Sorting By empId");
        listDisplay(eList);
        System.out.println("Sorting By Salary");
        Collections.sort(eList, new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                return Double.compare(emp1.getEmpSalary(), emp2.getEmpSalary());
            }

        });
        listDisplay(eList);
        System.out.println("Sorting By Name");
        Collections.sort(eList, new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                return emp1.getEmpName().compareTo(emp2.getEmpName());
            }

        });
        listDisplay(eList);

    }

    public static void listDisplay(List<Employee> listOfEmployee) {
        listOfEmployee.forEach(emp -> {
            System.out.println(emp);
        });
    }

}
