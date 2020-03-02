package com.sankir;
//5.Three digit Sum -Find out all the numbers between 1 and 999 where sum of 1st digit and 2nd digit is equal to 3rd digit.
public class ThreeDiSum {

    public static boolean Div(int n){
        int sum=0,count=0,mod=0;
        int m=n;
        int cou=m%10;
        m/=10;

        while(count<2){
            mod=m%10;
            m=m/10;
            sum+=mod;
            count++;
        }
        if(sum==cou)
            return true;
        else
            return false;

    }

    public static void main(String[] args) {
      for (int i = 1; i < 999; i++) {
            if (Div(i) == true)
                System.out.println("The Number is sum of 1st digit and 2nd digit is equal to 3rd digit  " + i);
//          else
//             System.out.println("Not Armstrong" + i);
        }
    }

    }
