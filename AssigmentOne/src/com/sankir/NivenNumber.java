package com.sankir;

//11. Niven Number : List all Niven numbers between 1 and 1000
//
//Description:
//        Niven Number is a number  that is divisible by the sum of its digits.
//        Ex:
//        The number 18 is a Niven number in base 10, because the sum of the digits 1 and 8 is 9 (1 + 8 = 9), and 18 is divisible by 9 (since 18 % 9 = 0)
//        The number 1729 is a Niven number in base 10, because the sum of the digits 1 ,7, 2 and 9 is 19 (1 + 7 + 2 + 9 = 19), and 1729 is divisible by 19 (1729 = 19 * 91)
//

public class NivenNumber {

    public static boolean niven(int n){
        int var=n,mod=0,sum=0;
        while(var>0){
            mod=var%10;
            sum=sum+mod;
            var/=10;
        }
        if(n % sum==0)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        for (int i = 1; i < 1000; i++) {
            if (niven(i))
            System.out.println("The number is a niven number "+i);

        }
    }
}
