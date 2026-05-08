import java.util.Scanner;
import java.util.Stack;
public class NearestSmallerToRight {
    public static int[] nearestSmallerToRight(int n,int[] arr){
        int[] ans=new int[n];
        Stack<Integer> st=new Stack<>();

        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()>arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i]=-1;
            }else{
                ans[i]=st.peek();
            }
            st.push(arr[i]);
        }
        return ans;
    }

    public static void main(String[] args){
        try(Scanner sc=new Scanner(System.in)){
            int n=sc.nextInt();

            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }

            int ans[]=nearestSmallerToRight(n,arr);

            for(int i=0;i<n;i++){
                System.out.print(ans[i]+" ");
            }
        }
    }
    
}
