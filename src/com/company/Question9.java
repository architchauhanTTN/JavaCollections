package com.company;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Question9 {
    public static void answer() {
        Date d1 = new Date();
        System.out.println("today is "+ d1.toString());
//        Locale locItalian = new Locale("it","ch");
        //or
        Locale locItalian = new Locale("en","US");
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, locItalian);
        System.out.println("today is in Italian Language in Switzerland Format : "+ df.format(d1));
    }
}
