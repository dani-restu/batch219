package com.xsis.day1.Quis;

import java.util.Scanner;

public class Quis06 {

    static final double value = 703;

    public static void main(String[] args) {
        double weight, hight, bmi;
        Scanner scan = new Scanner(System.in);
        System.out.print("Input Your Weight : ");
        weight = scan.nextDouble();
        System.out.print("Input Your Hight : ");
        hight = scan.nextDouble();

        bmi = (weight * value)/(hight * hight);
        System.out.print("Body Mass Index Yang di Dapat : " + bmi);
    }
}