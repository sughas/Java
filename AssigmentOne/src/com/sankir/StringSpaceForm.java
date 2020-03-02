package com.sankir;

//20. Remove all the leading spaces except 1 between words in a sentence and print it
//        Ex: "	     The     dog    leaped over the      fence    ."
//        shold become
//        "The dog leaped over the fence".


import java.util.Scanner;
import java.util.StringTokenizer;

public class StringSpaceForm {
    public static String TextForma(String a){
        StringTokenizer st= new StringTokenizer(a," ");
        StringBuffer sb = new StringBuffer();

        while(st.hasMoreElements())
        {
            sb.append(st.nextElement()).append(" ");
        }

        String Format=sb.toString();
        return Format;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the text to Remove extra spaces:");
        String text=sc.nextLine();

        System.out.println(TextForma(text));

    }
}
