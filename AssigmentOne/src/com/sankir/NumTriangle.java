package com.sankir;
//
//16. Number Triangle
//        Given input of 5 - Number traingle of 5 is
//        1
//        2 2
//        3 3 3
//        4 4 4 4
//        5 5 5 5 5

import java.util.Scanner;

public class NumTriangle {
    public static void Traingle(int n){
        System.out.println("Forward Number Triangle");
        for (int i = 0; i <=n; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Reverse Number Triangle");
        System.out.println();
        for (int i = n; i >=0 ; i--) {
            for (int j = 0; j <i ; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to get the triangle :");
        int n=sc.nextInt();
        Traingle(n);
    }
}
