package com.techreturners.exercise001;

public class Exercise001 {

    // In this Kata, you will be given an array of numbers in which two numbers occur once and the rest occur only twice. 
    // Your task will be to return the sum of the numbers that occur only once.
    // For example, repeats([4,5,7,5,4,8]) = 15 because only the numbers 7 and 8 occur once, and their sum is 15.

    // More examples in exercise001 test cases.

    // Good luck!
    public static void main(String[] args){
        int[] a = {2,3,4,3,5,2,7};
        int x = a.length;
        System.out.println(singles(a,x));
    }

    public static int singles(int [] arr,int val){
        int x = arr[0];
        
        for(int i=0; i <val; i++){
            x = x ^ arr[i]; 
        }
        return x;
    }
}
