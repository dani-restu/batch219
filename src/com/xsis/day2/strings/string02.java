package com.xsis.day2.strings;

import java.util.Scanner;

public class string02 {
    public static void main(String[] args) {
        String s;
        String reverse;
        Scanner scan = new Scanner(System.in);
        System.out.println("input : ");
        s=scan.next();
        System.out.println("Hasil : "+s);
        reverse=""+s.charAt(3) + s.charAt(2) + s.charAt(1) + s.charAt(0);
        System.out.println("Reverse : "+reverse);
    }
}
