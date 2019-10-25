package com.xsis.day2.Quis2;

import java.util.Scanner;

public class Quis02 {
    public static void main(String[] args) {
        int a, b;
        Scanner scan = new Scanner(System.in);
        System.out.println("Input Bilangan Pertama : ");
        a = scan.nextInt();
        System.out.println("Input Bilangan Kedua : ");
        b = scan.nextInt();

        if (a > 0 && b > 0) {
            System.out.println("Positif");
        } else {
            System.out.println("negative one");
        }
    }
}
