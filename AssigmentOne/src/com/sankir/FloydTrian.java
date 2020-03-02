package com.sankir;

import java.util.Scanner;
//
//17. Implement gievn 'n' rows of Floyd's Traingle.
//        Floyd's triangle is a right-angled triangular array of natural numbers.
//        It is defined by filling the rows of the triangle with consecutive numbers, starting with a 1 in the top left corner:
//
//        Ex: Enter the number of rows for floyd's triangle:
//        6
//        Floyd's triangle
//        ****************
//        1
//        2 3
//        4 5 6
//        7 8 9 10
//        11 12 13 14 15
//        16 17 18 19 20 21


public class FloydTrian {


        public static void FTraingle(int n){
            int num=1,num2=1;
            System.out.println("Forward Floyd's Number Triangle");
            for (int i = 0; i <=n; i++) {
                for (int j = 0; j <i ; j++) {
                    System.out.print("\t "+num++);
                }
                System.out.println();
            }
            System.out.println();
            System.out.println("Reverse  Floyd's Number Triangle");
            System.out.println();
            for (int i = n; i >=0 ; i--) {
                for (int j = 0; j <i ; j++) {
                    System.out.print("\t"+num2++);
                }
                System.out.println();
            }

        }

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number to get the triangle :");
            int n=sc.nextInt();
            FTraingle(n);
        }
    }


