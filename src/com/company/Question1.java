package com.company;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class Question1 {
    static Scanner sc = new Scanner(System.in);

    public static void answer(){
        ArrayList < Float > list = new ArrayList<>();

        for(int  i = 0 ; i < 5 ; i++) {
            Float x = sc.nextFloat();
            list.add(x);
        }
        Float sum = 0.0f;
//        for(int i = 0 ; i < 5  ; i ++){
//            sum = sum + list.get(i);
//        }
//        for (Float number : list) {
//           sum = sum + number;
//        }
        Iterator < Float > it = list.iterator();
        while(it.hasNext()) {

            sum += it.next();
        }
        System.out.println(sum);
    }
}
