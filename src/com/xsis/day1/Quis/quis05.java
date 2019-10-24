package com.xsis.day1.Quis;

import  java.util.Scanner;

public class quis05 {
    static final double cc = 32;
    static final double cd = .556;

    public static void main(String[] args) {
        double celcius, farenheit;
        Scanner scan = new Scanner(System.in);
        System.out.println("Input Temperatur in Farenheit : ");
        farenheit = scan.nextDouble();
        celcius = (farenheit+ cc)/cd;
        System.out.println("after convertion to Kelvin :"+ celcius);
    }
}
