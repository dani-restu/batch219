package com.xsis.day1.Quis;

import java.util.Scanner;

public class Quis07 {
    static final double banyakProduct = 3;

    public static void main(String[] args) {
        double product1, product2, product3, ratarata1, ratarata2, pajak, totalHarga, totalHargaTax;
        Scanner scan = new Scanner(System.in);
        System.out.print("Harga Product 1 : ");
        product1 = scan.nextDouble();
        System.out.print("Harga Product 2 : ");
        product2 = scan.nextDouble();
        System.out.print("Harga Product 3 : ");
        product3 = scan.nextDouble();
        System.out.print("Pajak Tiap-tiap Product (%) : ");
        pajak = scan.nextDouble();
        totalHarga = product1+product2+product3;
        System.out.println("Total Harga Semua Product : " + totalHarga);
        totalHargaTax = (product1 + (product1/100)) + (product2 + (product2/100)) + (product3 + (product3/100));
        System.out.println("Total Harga Semua Product Setelah Terkena Pajak : " + totalHargaTax);
        ratarata1 = totalHarga / banyakProduct;
        ratarata2 = totalHargaTax / banyakProduct;
        System.out.println("Rata-rata Harga Product Sebelum Terkena Pajak : " + ratarata1);
        System.out.println("Rata-rata Harga Product Setelah Terkena Pajak : " + ratarata2);
        }
}
