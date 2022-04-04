class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        
        int[] ans = new int[n];
        
        Stack<Integer> st = new Stack();
        
        for(int i=n-1;i>=0;i--) st.push(nums[i]);
        
        for(int i = n-1;i>=0;i--){
            if(st.isEmpty()) ans[i] = -1;
            else{
                while(!st.isEmpty() && nums[i]>=st.peek()) st.pop();
                
                if(st.isEmpty()) ans[i] = -1;
                else ans[i] = st.peek();
            }
            
            st.push(nums[i]);
        }
        
        return ans;
    }
}