package com.xsis.day1;

import java.util.Scanner;
/* menghitung luas kingkaran

 */
public class Practice04 {
    // deklarasikan variable pi menjadi static
    // variable agar bisa diakses oleh main method
    static final double pi = 3.14;

    public static void main(String[] args) {
        double area, radius;
        Scanner scan = new Scanner(System.in);
        System.out.print("Radius : ");
        radius = scan.nextDouble();
        // calculate area
        area = pi * (radius*radius);
        System.out.println("Luas lingkaran: " + area);
    }
}
