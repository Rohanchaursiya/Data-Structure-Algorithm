package RECURSION;

import java.util.*;
public class Recursion03 {

    // Sum of an Array(Parameterised Recursion)
    public static void sumOf1toN(int i,int sum){
        if(i<1){
            System.out.println(sum);
            return;
        }
        sumOf1toN(i-1, sum+i);
    }

    // Sum of an Array(Functional Recursion)
    public static int sumOf1toN(int n){
        if(n==0){
            return 0;
        }
        return n+sumOf1toN(n-1);
    }

    // find the factorial on Number
    public static int factorialOfNUmber(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*factorialOfNUmber(n-1);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        sumOf1toN(n, 0);

        System.out.println(sumOf1toN(n));

        System.out.println(factorialOfNUmber(n));

        sc.close();
    }

    
}
