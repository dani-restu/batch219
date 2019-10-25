package com.xsis.day2.Quis2;

import java.util.Scanner;

public class Quis04 {
    public static void main(String[] args) {
        String a;
        Scanner scan = new Scanner(System.in);
        System.out.println("Input Your Text");
        a = scan.nextLine();

        if (a.length() > 20)
        {
            System.out.println("Your Text Have Many Characters");
        }else {
            System.out.println("Your Text Less Characters");
        }
        System.out.println(a.length());



    }
}
