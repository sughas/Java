package com.sankir;

//
//13. Given a non-empty array of integers, return the third maximum number in this array. If it does not exist, return the maximum number.
//The time complexity must be in O(n).
//
//Example 1:
//Input: [3, 2, 1]
//
//Output: 1
//
//Explanation: The third maximum is 1.
//Example 2:
//Input: [1, 2]
//
//Output: 2

import java.util.Scanner;

public class ThirdMaxNum {

    public static void ThirdLa(int[] arr){
        int larg=0,seco=0,thi=0;

        for (int i = 0; i < arr.length ; i ++)
        {

            if (arr[i] > larg)
            {
                thi = seco;
                seco = larg;
                larg = arr[i];
            }


            else if (arr[i] > seco)
            {
                thi = seco;
                seco = arr[i];
            }

            else if (arr[i] > thi)
                thi = arr[i];
        }

        System.out.println("Three largest elements are " +
                larg + " " + seco + " " + thi);
    }


    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int len=sc.nextInt();
        int []a=new int[len];
        for (int i = 0; i <len; i++) {
            a[i]=sc.nextInt();
        }
        ThirdLa(a);
        sc.close();
    }
}
