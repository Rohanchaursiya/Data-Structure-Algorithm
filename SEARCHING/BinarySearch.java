package SEARCHING;

import java.util.*;
public class BinarySearch {

    private static void printArray(int arr[]){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }

    private static int binarySearch(int n,int arr[], int target){
        int low=0, high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;

            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
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

        Arrays.sort(arr);
        printArray(arr);

        int ans=binarySearch(n,arr,target);
        System.out.println(ans);

        sc.close();
    }
    
}
