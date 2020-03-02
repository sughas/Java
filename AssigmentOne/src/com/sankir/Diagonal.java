package com.sankir;

//14. Given a square matrix, calculate the absolute difference between the sums of its diagonals.
//
//        For example, the square matrix  is shown below:
//
//        1 2 3
//        4 5 6
//        9 8 9
//        The left-to-right diagonal =15 . The right to left diagonal = 17. Their absolute difference is 2.


import java.util.Scanner;

public class Diagonal {

    public static int  DiagSum(int [][] arr){
        int d1=0,d2=0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr.length; j++) {
                if(i==j){
                    d1+=arr[i][j];
                }
                if(i==(arr.length - j-1) ){
                    d2+=arr[i][j];
                }
            }
        }
        System.out.println("the diagnaol matrix :"+d1);
        System.out.println("the diagnol matrix :"+d2);
        return (Math.abs(d1-d2));
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the SIZE of the square matrix :");
        int m=sc.nextInt();
        System.out.println("Enter the Square martix elements:");
        int[][] a= new int[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("The difference is :"+DiagSum(a));
        sc.close();
    }
}
