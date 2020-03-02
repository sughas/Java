package com.sankir;

//6. Problem Statement - Calculate sum of the all digits of a given number.
//        Ex: 12345678910
//        Sum of digits of a number is 46


import java.util.Scanner;

public class SumAllDigits {

    public static int SumDigit(int n){
        int sum=0;
        int count=0,mod=0;
        int m=n;
//        while(m>0){
//            m=m/10;
//            count++;
//        }
//        m=n;
        while(m>0){
            mod=m%10;
            m=m/10;
            sum+=mod;
        }
            return sum;
            }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number to calculte the sum of digits:");
        System.out.println(SumDigit(sc.nextInt()));
        sc.close();
    }
}

