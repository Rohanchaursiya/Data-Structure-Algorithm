package SORTING;

import java.util.*;
public class SelectionSort {

    private static void printArray(int n, int arr[]){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


    private static void selectionSort(int n, int arr[]){
        for(int i=0;i<n-1;i++){
            int min_idx=i;
            for(int j=i+1; j<n;j++){
                if(arr[j]<arr[min_idx]){
                    min_idx=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min_idx];
            arr[min_idx]=temp;
        }

    }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        printArray(n, arr);
        selectionSort(n, arr);
        printArray(n, arr);

        sc.close();
    }
    
}
