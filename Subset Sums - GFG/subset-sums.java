// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();
			ArrayList<Integer> arr = new ArrayList<>();
			for(int i = 0; i < N ; i++){
			    arr.add(sc.nextInt());
			}
            Solution ob = new Solution();
         
            ArrayList<Integer> ans = ob.subsetSums(arr,N);
            Collections.sort(ans);
            for(int sum : ans){
                System.out.print(sum+" ");
            }
            System.out.println();
        }  
    }
}
// } Driver Code Ends


//User function Template for Java//User function Template for Java
class Solution{
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        // code here
        
        ArrayList<Integer> ans =  new ArrayList<>();
        
        subset(ans,0,0,N,arr);
        
        return ans;
    }
    
    public void subset(ArrayList<Integer> ans, int sum, int ind,int N, ArrayList<Integer> arr){
        if(ind == N){
            ans.add(sum);
            return;
        }
        
        subset(ans,sum,ind+1,N,arr);
        subset(ans,sum+arr.get(ind),ind+1,N,arr);
    }
}