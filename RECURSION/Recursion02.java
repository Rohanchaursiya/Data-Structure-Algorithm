package RECURSION;

import java.util.*;
public class Recursion02 {

    // Print N times using Recursion
    public static void printName(int times,int n){
        if(times>n){
            return;
        }
        System.out.print("Rohan ");
        printName(times+1, n);
    }

    // Print Number from 1 to N
    public static void print1toN(int i,int n){
        if(i>n){
            return;
        }
        System.out.print(i+" ");
        print1toN(i+1, n);
    }

    // Print Number from N to 1
    public static void printNto1(int i,int n){
        if(i<1){
            return;
        }
        System.out.print(i+" ");
        printNto1(i-1, n);
    }

    // Print Number from 1 to N using Backtrack
    public static void backtrackPrint1toN(int i,int n){
        if(i<1){
            return;
        }
        backtrackPrint1toN(i-1, n);
        System.out.print(i+" ");
    }

    // Print Number from N to 1 using Backtrack
    public static void backtrackPrintNto1(int i,int n){
        if(i>n){
            return;
        }
        backtrackPrintNto1(i+1, n);
        System.out.print(i+" ");
    }


    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        System.out.println("Print name n time");
        printName(1, n);
        System.out.println();

        System.out.println("Print Number 1 to n time");
        print1toN(1, n);
        System.out.println();

        System.out.println("Print Number n to 1");
        printNto1(n, n);
        System.out.println();

        System.out.println("Print Number 1 to n time");
        backtrackPrint1toN(n, n);
        System.out.println();

        System.out.println("Print Number n to 1");
        backtrackPrintNto1(1, n);
        System.out.println();

        sc.close();
    }
    
}
