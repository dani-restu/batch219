package com.xsis.day1.Quis;

import java.util.Scanner;

public class Quis01 {
    static final double jumlahsudutsegitiga = 180;

    public static void main(String[] args) {
        double sudut1, sudut2, sudut3;
        Scanner scan = new Scanner(System.in);
        System.out.println("Sudut Segitiga 1 : ");
        sudut1 = scan.nextDouble();
        System.out.println("Sudut Segitiga 2 : ");
        sudut2 = scan.nextDouble();
        sudut3 = jumlahsudutsegitiga - (sudut1 + sudut2);
        System.out.print("Jadi sudut sgitita ketiga adalah : " + sudut3);
    }
}
