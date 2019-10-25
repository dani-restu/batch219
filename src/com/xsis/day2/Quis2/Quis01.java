package com.xsis.day2.Quis2;

import java.util.Scanner;

public class Quis01 {
    public static void main(String[] args) {
        int a;
        Scanner scan = new Scanner(System.in);
        System.out.println("Input Bilangan : ");
        a = scan.nextInt();

        if (a > 0) {
            System.out.println("Positif");
        }else {
            System.out.println("negatif");
        }

    }
}

