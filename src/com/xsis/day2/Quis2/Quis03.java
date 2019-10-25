package com.xsis.day2.Quis2;

import java.util.Scanner;

public class Quis03 {
    public static void main(String[] args) {
        String s;
        Scanner scan = new Scanner(System.in);
        System.out.println("Input Text : ");
        s = scan.nextLine();

        if (s.equals(s.toUpperCase()))
        {
            System.out.println(" Your Text is Uppercase");
    }else {
            System.out.println(" Your Text is Lowecase");
        }
    }
}
