package com.xsis.day2.Quis2;

import java.util.Scanner;

public class Quis07 {
    public static void main(String[] args) {
        int r, s, t, average;
        Scanner scan = new Scanner(System.in);
        System.out.println("Temperature in Washington : ");
        r=scan.nextInt();

        System.out.println("Temperature in Canada : ");
        s=scan.nextInt();

        System.out.println("Temperature in Nevada : ");
        t=scan.nextInt();

        average= (r+s+t)/3;
        System.out.println(average);

        System.out.println("Average : "+average);
        if (average > 65) {
            System.out.println("Heat Wave");
        }else {
            System.out.println("Cool Wave");
        }
    }
}
