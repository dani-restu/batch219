package com.xsis.day2.condition;

import java.util.Scanner;

public class If05 {
    public static void main(String[] args) {
        int hari;
        Scanner scan = new Scanner(System.in);
        System.out.println("Input hari dalam angka : ");
        hari=scan.nextInt();
        //gunakan case
        switch (hari){
            case 1 :
                System.out.println("Minggu");
                break;
            case 2 :
                System.out.println("Senin");
                break;
            case 3 :
                System.out.println("Selasa");
                break;
            case 4 :
                System.out.println("Rabu");
                break;
            case 5 :
                System.out.println("Kamis");
                break;
            case 6 :
                System.out.println("Jumat");
                break;
            case 7 :
                System.out.println("Sabtu");
                break;
            default:
                System.out.println("Kiamat cuk......");
        }
    }
}