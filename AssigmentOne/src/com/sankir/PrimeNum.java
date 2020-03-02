package com.sankir;

public class PrimeNum {

    public static boolean Isprime(int n){
        boolean flag= true;
        for (int i = 1; i < n/2; i++) {
            if (n % i == 0){
                flag = false;

            }
            else
                flag = true;
        }
        return flag;
    }
    public static void main(String[] args) {
        System.out.println("The prime number between 1 to 1000 are :");
        System.out.println();
        for (int i = 1; i <1000 ; i++) {
            if(Isprime(i)){
                System.out.println(i);
            }
        }
    }
}
