class Solution {
    public int findMin(int[] nums) {
        //  int n=nums.length,i=0,j=n-1;
        // int min=Integer.MIN_VALUE;
        // while(i<j){
        //     int mid=i+(j-i)/2;
        //     if(nums[mid]>nums[j]){
        //         i=mid+1;
        //     }
        //     else if(nums[mid]<nums[j] ){
        //         j=mid;
        //     }
        //     else {
        //         j--;
        //     }
        // }
        // return nums[i];
        Arrays.sort(nums);
        return nums[0];
    }
}