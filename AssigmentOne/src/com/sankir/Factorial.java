package com.sankir;



//2.

import java.util.Scanner;

public class Factorial {
    public int Fact(int n){
        int fac=1;
        for (int i = n; i > 1; i--) {
            fac*=i;
        }
        return fac;
        }

    public static void main(String[] args) {

        System.out.println("Enter the a number to factorial of a number :");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        Factorial f= new Factorial();
        System.out.println("Factorial of the given "+n+" "+f.Fact(n));
        sc.close();
    }
    }

