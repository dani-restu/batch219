package com.xsis.day2.Quis2;

import java.util.Scanner;

public class Quis05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, c, d;
        System.out.println("Input Number 1 : ");
        a=scan.nextInt();

        System.out.println("Input Numbers 2 : ");
        b=scan.nextInt();

        System.out.println("Input numbers 3 : ");
        c=scan.nextInt();

        System.out.println("Input Numbers 4 : ");
        d=scan.nextInt();

        if (a > 0 && b > 0 && c > 0 && d > 0 ){
            System.out.println("Your Numbers is Positive");
        }else {
            System.out.println("Among The give Numbers,there is an negative one");
        }

    }
}
