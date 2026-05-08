import java.util.Scanner;
import java.util.Stack;
public class StockSpanProblem {
    public static int[] stockSpanProblem(int n, int[] arr){
        int[] ans=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]<=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i]=i+1;
            }else{
                ans[i]=i-st.peek();
            }
            st.push(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            int n=sc.nextInt();
            int[] arr=new int[n];

            for(int i=0;i<n;i++){
               arr[i]=sc.nextInt();
            }

            int[] ans=stockSpanProblem(n,arr);
            
            for(int i=0;i<n;i++){
                System.out.print(ans[i]+" ");
            }

        }
    }
}
