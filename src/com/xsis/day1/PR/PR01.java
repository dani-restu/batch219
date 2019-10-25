package com.xsis.day1.PR;

import java.util.Scanner;

public class PR01 {
    public static void main(String[] args) {
        int input, hasil;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any Integer : ");
        input = scan.nextByte();
        hasil = (input%10)*8;
        System.out.println("The result is :"+ hasil);
    }

}
