package com.xsis.day2.Quis2;

import java.util.Scanner;

public class Quis06 {
    public static void main(String[] args) {
        int a, s;
        Scanner scan = new Scanner(System.in);

        System.out.println("Input Firts Number : ");
        a=scan.nextInt();

        System.out.println("Input Second Number : ");
        s=scan.nextInt();

        if (a > s)
        {
            System.out.println(s+"    "+a);
        }
        else {
            System.out.println(a+"     "+s);
        }
    }

}
