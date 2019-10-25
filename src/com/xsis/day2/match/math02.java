package com.xsis.day2.match;

import java.util.Scanner;

public class math02 {
    public static void main(String[] args) {
        double s, a, t;
        Scanner scan = new Scanner(System.in);
        System.out.print("jarak : ");
        s = scan.nextDouble();

        System.out.print("percepatan : ");
        a = scan.nextDouble();

        t= Math.sqrt(2 * s / a);
        System.out.println("Waktu yang ditempuh mobil : "+ t);
        //dibulatkan ke atas, jika > 0.5 return value dibulatkan ke 1
        System.out.println("Waktu yang ditempuh mobil : "+Math.round(t));
        //dibulatkan ke bawah, jika < 0.5 retunrn value 0.5
        System.out.println("Waktu yang ditempuh mobil : "+Math.floor(t));
    }
}
