class Solution {
    public int maxWidthRamp(int[] nums) {
        int n=nums.length;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            if(st.isEmpty()||nums[i]<=nums[st.peek()]){
                st.push(i);
            }
        }
        int width=0;
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty()&&nums[i]>=nums[st.peek()]){
                width=Math.max(width,i-st.pop());
            }
        }
        return width;
    }
}