package com.sankir;
// 1.List all the Prime Numbers between 1 and 1000.

public class PrimeNumber {

    public static boolean IsPrime(int num) {
        boolean flag = true;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                flag = false;
                break;
            }
        }
     //   System.out.println(flag);
         return (flag);
//        if (!flag)
//            System.out.println("The prime number:"+num);

    }



    public static void main(String[] args) {
       // PrimeNumber p=new PrimeNumber();
        for(int j=1;j <=13 ;j++) {
        if(IsPrime(j))
            System.out.println("The prime number: "+j);
        }
        }
    }

