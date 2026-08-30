class Solution {
    public int minimumDeletions(int[] nums) {
         int minidx=0;
         int maxidx=0;
         for(int i=0;i<nums.length;i++){
            if(nums[i]<nums[minidx]){
                minidx=i;

            }
            if (nums[i] > nums[maxidx]) {
                maxidx = i;
            }
         }
         int n=nums.length;
         int left=Math.min(minidx,maxidx);
         int right=Math.max(minidx,maxidx);
        //1 remove from front
         int front=1+right;

         //2 remove from back
         int back=n-left;

         int both=(left + 1) + (n - right);

         return Math.min(front,Math.min(back,both));
    }
}