package com.xsis.day1.PR;

import java.util.Scanner;

public class PR05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input, digit1, digit2, digit3, digit4, digit5, sisa;
        System.out.print("Enter the number : ");
        input = scan.nextInt();
        digit1=input/604800;
        sisa=input%604800;

        digit2=sisa/86400;
        sisa=sisa%86400;

        digit3=sisa/3600;
        sisa=sisa%3600;

        digit4=sisa/60;
        sisa=sisa%60;

        digit5=sisa;
        sisa=sisa%1;
        System.out.println("The result : "+ digit1 + " wekks "+ digit2 + " days " + digit3 + " Hours " + digit4 + " minutes " + digit5 + " seconds ");
    }
}
