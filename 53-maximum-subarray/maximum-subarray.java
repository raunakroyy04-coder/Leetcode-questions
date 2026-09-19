class Solution {
    public int maxSubArray(int[] nums) {
    int n=nums.length;
    long max=Long.MIN_VALUE;
    long sum=0;
    for(int i=0;i<n;i++){
        sum+=nums[i];
        if(sum>max) max=sum;
        if(sum<0) sum=0; 
    }
    return (int)max;
    }
}