package com.sankir;

//19. In the given array of numbers
//        calculate sum and avg of even numbers
//        calculate sum and avg of odd numbers

import java.util.Scanner;

//19. In the given array of numbers
//        calculate sum and avg of even numbers
//        calculate sum and avg of odd numbers


public class SumArray {
    public static void sum(int[] arr){
        int esum=0,odsum=0;
        for (int a:arr) {
            if(a%2==0){
                esum+=a;
            }
            else {
                odsum += a;
            }
        }
        System.out.println("The sum of even numbers in array : "+esum);
        System.out.println("The sum of odd numbers in array :"+odsum);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int n=sc.nextInt();
        int [] a=new int[n];
        System.out.println("Enter the array elements : ");
        for (int i = 0; i <n ; i++) {
            a[i]=sc.nextInt();
        }
        sum(a);
        sc.close();
    }
}
