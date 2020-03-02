package com.sankir;

//10.list all Emirp numbers between 1 and 1000
//        Description:
//        Emirp  number  is a number which is prime when read backwards and frontwards.
//        Ex: 13 is and emirp number since 13 and 31 both are prime numbers.
//        First few Emirp numbers 13, 17, 31, 37, 71, 73, 79, 97, 107, 113, 149, 157, 167, 179, 199, 311, 337, 347, 359, 389, 701, 709, 733, 739, 743, 751, 761, 769, 907, 937, 941, 953, 967, 971, 983, 991

public class EmirpNum {

    public static boolean IsPrime(int n){
        boolean flag=true;
        for (int i = 2; i <= n/2; i++) {
            if(n % i == 0){
                flag= false;
                break;
            }
        }
     //   System.out.println(flag);
        return flag;
    }

    public static void main(String[] args) {
        for (int i = 1; i <=499 ; i++) {
            if(IsPrime(i)){
                int n=i,rev=0,mod=0;
                 while(n>0){
                 mod= n % 10;
                 rev = rev*10 + mod;
                 n/=10;
                 }
                 if(IsPrime(i) && IsPrime(rev))
                 {
                     System.out.println("The number as well : "+i+" reverse of it : "+rev+" is Prime");
                 }
        }

        }
    }
}
