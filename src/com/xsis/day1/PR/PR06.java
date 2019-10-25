package com.xsis.day1.PR;

import java.util.Scanner;

public class PR06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input, pecahan20, pecahan10, pecahan5, pecahan1, sisa, hasil;
        System.out.println("Input jumlah uang : $");
        input=scan.nextInt();

        pecahan20=input/20;
        sisa=input%20;

        pecahan10=sisa/10;
        sisa=sisa%10;

        pecahan5=sisa/5;
        sisa=sisa%5;

        pecahan1=sisa;
        sisa=sisa%1;
        System.out.println(pecahan20 + "notes of $20" + pecahan10 + "notes of $10" + pecahan5 + "notes of $5" + pecahan1 + "notes of $1");
    }
}
