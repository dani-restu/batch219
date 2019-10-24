package com.xsis.day1;

import java.util.Scanner;

public class Practice03 {
    public static void main(String[] args) {
        // hitung kuas persegi panjang
        Scanner scan = new Scanner(System.in);
        int panjang=0, lebar=0, luas;

        System.out.print("panjang: ");
        panjang = scan.nextInt();
        System.out.print("lebar :");
        lebar = scan.nextInt();
        luas = panjang * lebar;

        System.out.print("luas persegi panjang:"+luas);
    }
}
