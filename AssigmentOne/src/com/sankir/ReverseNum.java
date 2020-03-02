package com.sankir;

// 7. Problem Statement - Find the reverse of the given number.
//Ex:153
//reverse of the number is 351

import java.util.Scanner;

public class ReverseNum {

    public static int rev(int n){
        int m=n,mod=0,var=0;
        while(m>0){
            mod=m%10;
            var = (var*10)+ mod;
            m=m/10;
        }
        return var;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter to get reverse of the string: ");
        System.out.println(rev(sc.nextInt()));
        sc.close();
    }

}
