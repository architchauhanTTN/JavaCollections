package com.company;

import java.util.*;

public class Question6 {

    static Scanner sc = new Scanner(System.in);
    public static void answer() {

        List < Integer > list = new ArrayList<>();
        Map< Integer , Integer > freq = new HashMap<Integer, Integer>();
        Map < Integer , Integer > occur = new HashMap<Integer, Integer>();
        int n = sc.nextInt();
        for(Integer i = 0 ; i < n ; i++) {

            Integer x = sc.nextInt();
            if(freq.containsKey(x)){
                freq.put(x , freq.get(x) + 1);
            }
            else {
                freq.put(x , 1);
            }
               list.add(x);
            if(occur.containsKey(x) == false) {
                occur.put(x , i);
            }
        }

        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {

                // By Frequency
                if(freq.get(o1) - freq.get(o2) > 0) {
                    return -1;
                }
                else if (freq.get(o1) - freq.get(o2) < 0){
                    return 1;
                }
                else { // By First Occurence
                    if(occur.get(o1) - occur.get(o2) > 0){
                        return 1;
                    }
                    else return -1;
                }

            }
        });
        int si = list.size();
        for(int i = 0 ; i < si ; i++) {
            System.out.println(list.get(i));
        }
    }

}
