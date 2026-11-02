class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int mid=nums[n/2];
        int count=0;
        for(int i=0;i<n/2;i++){
            count+=nums[n/2]-nums[i];
        }
        for(int i=(n/2)+1;i<n;i++){
            count+=nums[i]-nums[n/2];
        }
        return count;
    }
}