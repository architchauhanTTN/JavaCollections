package com.company;

import java.util.HashSet;
import java.util.Scanner;

public class Question2 {
    static Scanner sc = new Scanner(System.in);
    public static void answer(){
        HashSet < Character > hashSet = new HashSet<Character>();
        String ip = sc.next();
        int si = ip.length();
        for(int i = 0 ; i < si ;i++) {
            hashSet.add(ip.charAt(i));
        }
        System.out.println(hashSet.size());

    }
}
