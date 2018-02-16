package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    String name;
    Integer rollNo;
    Integer score;
    Student(String name , Integer rollNo , Integer score) {
        this.name = name;
        this.rollNo = rollNo;

        this.score = score;
    }

}
public class Question5 {
    public static void  answer() {
        List< Student> students = new ArrayList< Student>();

        Student s1 = new Student("Archit" , 10 , 5);
        Student s2 = new Student("Pushkar" , 9 , 10);
        Student s3 = new Student("Swapnil" , 5 , 10);
        Student s4 = new Student("Payal" , 1 , 7);
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int compareScore ;
                int compareString;
                compareScore = o1.score - o2.score;
                if(compareScore > 0){
                    // o1 > o2
                    return 1;
                }
                else if (compareScore < 0) return -1;
                else {
                    compareString = o1.name.compareTo(o2.name);
                    if(compareString > 0) return 1;
                    else return -1;
                }
            }
        });
        for(Integer i = 0 ; i < 4 ; i++) {
            System.out.println(students.get(i).name + " " + students.get(i).score);
        }


    }

}
