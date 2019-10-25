package com.xsis.day2.condition;

import java.util.Scanner;

public class If04 {
    public static void main(String[] args) {
        int nilai;
        char grad=' ';
        Scanner scan = new Scanner(System.in);
        System.out.println("Input Nilai : ");
        nilai=scan.nextInt();
        if (nilai>= 90) {
            grad = 'A';
        }else if ( nilai < 90){
            grad='B';
        }

        System.out.println("grad : "+grad);
    }
}
