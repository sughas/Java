package com.sankir;

// 18. find out the factorial of a number using recursion. ( function calling itself )

import java.util.Scanner;

public class RecursionFact {
    public static int fact(int n){
        if(n>=1)
            return (n*fact(n-1));
        else
            return 1;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number to get Fact of it : ");
        int num=sc.nextInt();
        System.out.println("The factorial of the number is : "+fact(num));
        sc.close();
    }
}
