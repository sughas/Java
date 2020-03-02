package com.sankir;

//12. Given a collection of distinct integers, return all possible permutations.
//
//        Example:Input: [1,2,3]
//        Output:
//        [
//        [1,2,3],
//        [1,3,2],
//        [2,1,3],
//        [2,3,1],
//        [3,1,2],
//        [3,2,1]
//        ]


import java.util.Scanner;

public class Permutations {

    public static String permu(String str, int l, int r)
        {
            if (l == r)
                System.out.println(str);
            else
            {
                for (int i = l; i <= r; i++)
                {
                    str = swap(str,l,i);
                    permu(str, l+1, r);
                    str = swap(str,l,i);
                }
            }
            return str;
        }


    public static String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to get possiable permutation :");
        String st = sc.nextLine();
        System.out.println();
        System.out.println(permu(st,0,(st.length()-1)));
        
    }
}
