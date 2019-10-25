package com.xsis.day1.PR;

import java.util.Scanner;

public class PR04 {
    public static void main(String[] args) {
        int input, hasil;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer : ");
        input = scan.nextInt();
        hasil= (input+1)%2;
        System.out.println("The result is : "+hasil);
    }
}
