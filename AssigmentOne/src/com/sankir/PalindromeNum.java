package com.sankir;

//
//8. Problem Statement - List all Palindrome numbers between 1 and 1000
//        Description:
//        Palindrome Number : A number is said to be a palindrome number when is reverse is equal to the number itself.
//        In other words, it is the same if you read it from left to right or vice-versa OR it is a number that remains the same when its digits are reversed.
//        Like 151, for example, it is "symmetrical".
//
//        Ex of Palindrome numbers are : 11, 22, 33, 44, 55, 66, 77, 88, 99, 101, 111, 121, 131, 141, 151, 161, 171, 181, 191, 202,303,404,414 etc

public class PalindromeNum {
    public static int val;
    public static boolean palindrome(int n){
        int m=n,mod=0;
        val=0;
        while(m>0){
            mod=m%10;
            val=(val*10)+mod;
            m/=10;
        }
        if(val==n)
            return true;
        else 
            return false;
    }

    public static void main(String[] args) {
        System.out.println("Palindrome number between 1 to 1000 ");
        for (int i = 1; i < 1000; i++) {
            if(palindrome(i))
                System.out.println(i+" reversed "+ val);
        }
    }
}
