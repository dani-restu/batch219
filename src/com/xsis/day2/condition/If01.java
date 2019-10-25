package com.xsis.day2.condition;

public class If01 {
    public static void main(String[] args) {
        String a, b, c;
        a = "Hello";
        b = "xsis";
        c = "Hello";
        /*if (a.equals(b)){
            System.out.println("Object String Equal");
        }else{
            System.out.println("Object String Beda");
        }*/

        //negatif
        /*if (a.equals(c)){
            System.out.println("False");
    }else{
            System.out.println("True");
        }*/
        // siswa umur > 20 dan (ipk > 3.01 && ipk < 3.5)
        int umur = 21;
        double ipk = 3.5;
        if (umur > 20 && ipk > 3.01 && ipk < 3.5) {
            System.out.println("found");
        } else {
            System.out.println("false");
        }
    }
}
