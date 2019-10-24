package com.xsis.day1;

import java.util.Scanner;

class Practice07 {
    public static void main(String[] args) {
        double itemBeforeDiscount, discount, itemAfterDiscount;
        Scanner scan = new Scanner(System.in);
        System.out.println("Harga Item Barang : ");
        itemBeforeDiscount = scan.nextDouble();
        System.out.println("Discount % : ");
        discount = scan.nextDouble();
        itemAfterDiscount = itemBeforeDiscount - (itemBeforeDiscount * discount/100);
        System.out.println("Item After Discount : "+itemAfterDiscount);
        }
    }
