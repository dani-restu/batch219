package com.xsis.day1.Quis;

import java.util.Scanner;

public class Quis08 {

// static final double price = 200000

    public static void main(String[] args) {

    double price,discount, total, getDiscount;
    Scanner scan = new Scanner(System.in);
    System.out.print("Harga Barang : ");
    price = scan.nextDouble();
    System.out.print("Mendapat Discount : ");
    discount = scan.nextDouble();

    total = price - (price * discount/100);
    getDiscount = price * discount/100;

    System.out.println("Total Harga : " + total);
    System.out.println("Hemat Biaya : " + getDiscount);
    }
}

