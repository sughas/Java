package com.sankir;

public class ArmstrongNum {

//4. Problem Statement - List all the Armstrong numbers between 1 and 1000
//    Description:
//    Armstrong number or also called Narcissistic Number - An Armstrong number is a number that is equal to the sum of digits raise to the power total number of digits in the number.
//            Ex-1: Between 0 and 1000 -  Armstrong number is a number that is equal to the sum of cubes of its digits. For example 0, 1, 153, 370, 371 and 407 are the Armstrong numbers.
//            153 = 1^3 + 5^3 + 3^3
//    Ex-1: Between 1000 and 10000 - 1634, 8208, 9474 are the Armstrong numbers.
//            1634 = 1^4 + 6^4 + 3^4 + 4^4


    public static boolean amstro(int n){
        int sum=0;
        int count=0,mod=0;
        int m=n;
        while(m>0){
            m=m/10;
            count++;
        }
        m=n;
        while(m>0){
            mod=m%10;
            m=m/10;
            sum+=(int) Math.pow(mod,count);
        }
        if(n==sum)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        //ArmstrongNum am= new ArmstrongNum();
      for (int i = 1; i < 1700; i++) {
          if (amstro(i) == true)
              System.out.println("The Number is Amstrong " + i);
//          else
//             System.out.println("Not Armstrong" + i);
            }
        }
    }


