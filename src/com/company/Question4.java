package com.company;

import java.util.*;

class Employee implements Comparable <Employee> {
    Double age ;
    Double salary;
    String name ;
    Employee(Double age , Double salary , String Name) {
        this.age = age;
        this.salary = salary;
        this.name = Name;
    }
    public String tellName() {
        return this.name;
    }
    public Double tellAge() {
        return this.age;
    }
    public Double tellSalary(){
        return this.salary;
    }
    public int compareTo(Employee E) {
        Double compareEmployeeNext = E.salary;
        Double compareEmployeeThis = this.salary;
        if(compareEmployeeThis - compareEmployeeNext > 0) {
            return 1;
        }
        if(compareEmployeeThis - compareEmployeeNext < 0) {
            return -1;
        }
        return 0;
//        return (int)(compareEmployeeThis - compareEmployeePrev);
    }

}
public class Question4 {


    public static void answer(){
//        Employee E[] = new Employee[4];
        Employee pushkar = new Employee(23.5 , 30000.0 , "Pushkar");
        Employee archit = new Employee(22.4 , 3000.0 , "Archit");
        Employee swapnil = new Employee(21.5 , 15000.0 , "Swapnil");
        Employee payal = new Employee(19.5 , 16000.0 , "Payal");
//        E[0] = pushkar;
//        E[1] = archit;
//        E[2] = swapnil;
//        E[3] = payal;
        List < Employee > E = new ArrayList<>();
        E.add(pushkar);
        E.add(archit);
        E.add(swapnil);
        E.add(payal);
        System.out.println("Before Sorting --");
        for(Integer i = 0 ; i < 4 ; i++) {
            System.out.println(E.get(i).tellName() + " " + E.get(i).tellSalary());
        }
        System.out.println("After Sorting --");
        Collections.sort(E);
        for(Integer i = 0 ; i < 4 ; i++) {
            System.out.println(E.get(i).tellName() + " " + E.get(i).tellSalary());
        }
        Collections.sort(E, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if(o1.salary < o2.salary) return 1;
                if(o1.salary > o2.salary) return -1;
                return 0;
            }
        });
        System.out.println("After Comparator ----(Again Descending Order)");
        for(Integer i = 0 ; i < 4 ; i++) {
            System.out.println(E.get(i).tellName() + " " + E.get(i).tellSalary());
        }

    }

}
