package com.xsis.day1.Quis;

import java.util.Scanner;

public class Quis09 {
    static final double pajak = 20;
    static final double harga =15000;

    public static void main(String[] args) {
        double kwhAwal, kwhAkhir, totalKwh, tagihan, tagihanPajak, totalTagihan;
        Scanner scan = new Scanner(System.in);
        System.out.print("Penggunaan Killowatt-Hour Awal Bulan\t : ");
        kwhAwal = scan.nextDouble();
        System.out.print("Penggunaan Killowatt-Hour Akhir Bulan\t : ");
        kwhAkhir = scan.nextDouble();
        totalKwh = kwhAkhir - kwhAwal;
        System.out.println("Total Penggunaan kwh Akhir Bulan ini\t\t\t : " + totalKwh);
        tagihan = totalKwh * harga;
        tagihanPajak = tagihan * pajak/100;
        totalTagihan = tagihan + tagihanPajak;
        System.out.println("-------------------------------------------- : ");
        System.out.println("Tagihan Listrik\t : " + tagihan);
        System.out.println("Pajak\t\t\t : " + tagihanPajak);
        System.out.println("Total Tagihan\t : " + totalTagihan);
    }
}
