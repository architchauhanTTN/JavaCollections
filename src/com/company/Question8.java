package com.company;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Question8 {
    public static void answer() {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMMM-YY");
        String s = simpleDateFormat.format(date);
        System.out.println(s);
    }
}
