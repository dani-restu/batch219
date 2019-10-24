package com.xsis.day1;

import java.util.Scanner;

// konversi temperatur dari farenheit ke kelvin
// rumus: kelvin = (farenheit + 459.67)/1.8
public class Practice08 {
    static final double cf = 459.67;
    static final double cd = 1.8;

    public static void main(String[] args) {
        double kelvin, farenheit;
        Scanner scan = new Scanner(System.in);
        System.out.println("Input Temperatur in Farenheit : ");
        farenheit = scan.nextDouble();
        kelvin = (farenheit+ cf)/cd;
        System.out.println("after convertion to Kelvin :"+ kelvin);
    }
}
