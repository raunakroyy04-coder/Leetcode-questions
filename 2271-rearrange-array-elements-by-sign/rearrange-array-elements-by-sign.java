class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        // int pos[]=new int[n/2];
        // int neg[]=new int[n/2];
        // int p=0;
        // int nee=0;
        // for(int i=0;i<n;i++){
        //    if(nums[i]>0) pos[p++]=nums[i];
        //    else neg[nee++]=nums[i]; 
        // }
        // for(int i=0;i<n/2;i++){
        //     nums[2*i]=pos[i];
        //     nums[2*i+1]=neg[i];
        // }
        // return nums;
        int ans[]=new int[n];
        int pos=0,neg=1;
        for(int i=0;i<n;i++){
            if(nums[i]<0){
                ans[neg]=nums[i];
                    neg+=2;
            }
            if(nums[i]>0) {
                ans[pos]=nums[i];
                pos+=2;
            }
        }
        return ans;
    }
}