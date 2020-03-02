package com.sankir;

//3. Problem Statement - Find given number of elements in Fibonacci Series.
//        Description:
//        Fibonacii series is : 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377
//        i.e., starting from 3rd position - element is sum of previous two elements.
//        First element is 0 and Second element is 1

import java.util.Scanner;

public class FibonacciSeries {

    public int fibonacci(int n){
        int prev=0,curr=1,next=1;
        if(n==1){
            System.out.println("fibonacci "+prev);
        }
        else if(n==2){
            System.out.println("fibonacci "+curr);
        }
        else if(n>2){
            System.out.println("fibonacci "+prev);
            System.out.println("fibonacci "+curr);
            while(n!=0){
                next=prev+curr;
                System.out.println("fibonacci "+next);
                prev=curr;
                curr=next;
                n--;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        FibonacciSeries fs=new FibonacciSeries();
        System.out.println("Enter the a number to fibonacii of a number :");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        fs.fibonacci(n);
        sc.close();

    }
}
