package com.xsis.day2.strings;

public class string04 {
    public static void main(String[] args) {
        String s, st;
        s= "Hello .NET developer Welcome To Xsis Academy";
        System.out.println(s);
        st=s.replace(".NET","JAVA");
        System.out.println("Repace #1 : "+st);
        //replace Welcome jadi Hello
        st= st.replace("Welcome","Hello");
        System.out.println("Replace #2 : "+st);
        //replace
        st=s.replace(".NET","JAVA")
                .replace("Welcome","Aloha")
                .replace("Xsis Academy","XA");
        System.out.println("Replace #3 :"+st);

        // to uppercase to lowercase
        st=s.replace(".NET","JAVA")
                .replace("Welcome","Aloha")
                .replace("Xsis Academy","XA").toUpperCase();
        System.out.println("Replace #4 :"+st);

        st=s.replace(".NET","JAVA")
                .replace("Welcome","Aloha")
                .replace("Xsis Academy","XA").toLowerCase();
        System.out.println("Replace #5 :"+st);

    }
}
