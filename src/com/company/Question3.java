package com.company;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Question3 {
    static Scanner sc = new Scanner(System.in);

    public static void answer() {
        Map < Character, Integer > mtp = new HashMap <Character, Integer>() ;
        String s = sc.next();
        int si = s.length();
        for(int i = 0 ; i < si ; i++) {
            Character x = s.charAt(i);
            if(mtp.containsKey(x)){
                mtp.put(x , mtp.get(x) + 1);
            }
            else {
                mtp.put(x , 1);
            }
        }
//        System.out.println("Archit Chauhan\n");

        for ( Character a = 'a' ; a <= 'z' ; a++ ) {
            if(mtp.containsKey(a)) {
                System.out.println(a + " " + mtp.get(a));
            }
        }
    }
}
