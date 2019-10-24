package com.xsis.day1.Quis;

import java.util.Scanner;

public class Quis03 {
    static final double tax = .7;
    static  final double tips = .10;

    public static void main(String[] args) {
        double itemFood, itemDrink, itemEtc, total, pajak, tip, biaya;
        Scanner scan = new Scanner(System.in);
        System.out.print("Harga Makanan : ");
        itemFood = scan.nextDouble();
        System.out.print("Harga Minuman : ");
        itemDrink = scan.nextDouble();
        System.out.print("Harga Menu Tambahan : ");
        itemEtc = scan.nextDouble();

        total = itemFood + itemDrink + itemEtc;
        pajak = total - (total * tax);
        tip = total * tips;
        biaya = total + pajak + tips;

        System.out.print(" Biaya Yang di Dapat : ");
        System.out.print("Total Orderan : " + total);
        System.out.print("Biaya Pajak : " + pajak);
        System.out.print("Biaya Tips : " + tips);
        System.out.print("Jumlah Biaya : " + biaya);
    }
}
