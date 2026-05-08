package STACK;

import java.util.Scanner;
import java.util.Stack;
public class MaximumAreaOfHistogram {
    public static int maximumAreaOfHistogram(int n, int[] arr){
        Stack<Integer> st=new Stack<>();
        int maxArea=0;

        for(int i=0;i<=n;i++){
            int currHeight=(i==n) ? 0 : arr[i];

            while(!st.isEmpty() && currHeight<arr[st.peek()]){
                int height=arr[st.pop()];
                int width=st.isEmpty() ? i : i-st.peek()-1;
                maxArea=Math.max(maxArea,height*width);
            }
            st.push(i);
        }
        return maxArea;
    }
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            int n=sc.nextInt();

            int[] arr=new int[n];

            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }

            System.out.println(maximumAreaOfHistogram(n,arr));
        }
    }
    
}
