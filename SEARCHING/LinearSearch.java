package SEARCHING;

import java.util.*;
public class LinearSearch {

    private static void printArray(int arr[]){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    private static int linearSearch(int n, int arr[], int target){
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();

        printArray(arr);
        int ans=linearSearch(n, arr, target);
        System.out.println(ans);
        

        sc.close();
    }
    
}
