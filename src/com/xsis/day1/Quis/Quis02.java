package com.xsis.day1.Quis;

import java.util.Scanner;

public class Quis02 {
    public static void main(String[] args) {
    double matkul1, matkul2, matkul3, matkul4,jumlah, ratarata;
    String nama;
    Scanner scan = new Scanner(System.in);
    System.out.print("Nilai Mata Kuliah Pertama : ");
    matkul1 = scan.nextDouble();
    System.out.print(" Nilai Mata Kuliah Kedua : ");
    matkul2 = scan.nextDouble();
    System.out.print("Nilai Mata Kuliah ketiga : ");
    matkul3 = scan.nextDouble();
    System.out.print("Nilai Mata Kuliah Keempat : ");
    matkul4 = scan.nextDouble();
    jumlah = matkul1 + matkul2 + matkul3 + matkul4;
    System.out.print("Tampilkan Jumlah : " + jumlah);
    ratarata = jumlah / 4;
    System.out.print("tampilkan Rata-rata : " + ratarata);
    }
}

