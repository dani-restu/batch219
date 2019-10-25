package com.xsis.day1.PR;

import java.util.Scanner;

public class PR03 {
    public static void main(String[] args) {
        int input, hasil;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer : ");
        input = scan.nextInt();
        hasil = (input%2);
        System.out.println("The result : "+hasil);
    }
}
