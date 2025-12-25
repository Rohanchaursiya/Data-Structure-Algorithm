package RECURSION;

import java.util.*;
public class Recursion04 {

    public static void printArray(int arr[]){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }

    public static void swap(int arr[],int left, int right){
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }

    //two pointer
    public static void reverseArray(int arr[],int left,int right){
        if(left>=right){
            return;
        }
        swap(arr,left,right);

        reverseArray(arr,left+1, right-1);
    }

    // simple
    public static void reverseArray(int i, int arr[]){
        if(i>=arr.length/2){
            return;
        }
        swap(arr,i,arr.length-1-i);

        reverseArray(i+1,arr);
    }

    public static boolean isPalindrome(int i,String str){
        if(i>=str.length()/2){
            return true;
        }
        if(str.charAt(i)!=str.charAt(str.length()-i-1)){
            return false;
        }
        return isPalindrome(i+1, str);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        printArray(arr);
        reverseArray(arr, 0, n-1);
        printArray(arr);
        reverseArray(0, arr);
        printArray(arr);

        String str=sc.next();

        System.out.println(isPalindrome(0, str));

        sc.close();
    }
    
}
