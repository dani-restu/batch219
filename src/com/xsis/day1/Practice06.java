package com.xsis.day1;

//calculate tax per item

import java.util.Scanner;

public class Practice06 {
    static final double pajak = .15;
    public static void main(String[] args) {
        double itemBeforetax, itemAfterTax;
        Scanner scan = new Scanner(System.in);
        System.out.println("Harga Sebelum Pajak : ");
        itemBeforetax = scan.nextDouble();
        itemAfterTax = itemBeforetax + (itemBeforetax * pajak);
        System.out.println("Harga Barang Setelah Pajak : "+itemAfterTax);
    }

}
