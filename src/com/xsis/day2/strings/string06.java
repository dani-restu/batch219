package com.xsis.day2.strings;

public class string06 {
    public static void main(String[] args) {
        String s, r1;
        s= " Hello Java Programmer ";
        System.out.println(s);
        r1= ""+s.substring(12,22)+s.substring(0,6)+s.substring(6,11);
        System.out.println("Change Order Name : "+r1);
    }
}
