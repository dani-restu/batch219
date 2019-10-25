package com.xsis.day2.strings;

import java.util.Scanner;

public class strings07 {
    public static void main(String[] args) {
        String s, t, hasil;
        double number;
        Scanner scan = new Scanner(System.in);
        System.out.println("User Name :");
        s = scan.nextLine();
        t=s.substring(0,4);
        number= 100* Math.random()+200;
        hasil=t+Math.round(number);
        System.out.println("Password : "+hasil);
    }
}
