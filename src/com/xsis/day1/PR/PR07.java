package com.xsis.day1.PR;

import java.util.Scanner;

public class PR07 {
    public static void main(String[] args) {
        int distance, digit1, digit2, digit3, digit4, sisa;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the distance : ");
        distance = scan.nextInt();
        digit1=distance/63360;
        sisa=distance%63360;

        digit2=sisa/36;
        sisa=sisa%36;

        digit3=sisa/12;
        sisa=sisa%12;

        digit4=sisa;
        sisa=sisa%1;
        System.out.println(digit1+"miles" + digit2 + "yards" + digit3 + "feets" + digit4 + "inches");
    }
}
