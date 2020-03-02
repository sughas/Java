package com.sankir;

//15. Check whether input year is leap year or not

import java.util.Scanner;

public class LeapYear {

    public static boolean IsLeap(int year){
        if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))
            return true;
            else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year to check for leap year : ");
        int num=sc.nextInt();
        if(IsLeap(num))
            System.out.println("The given year is leap: "+num);
        else
            System.out.println("Not a leap year :"+num);
        sc.close();
    }

}
