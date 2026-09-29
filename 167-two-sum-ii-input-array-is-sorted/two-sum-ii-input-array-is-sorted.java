class Solution {
    public int[] twoSum(int[] num, int target) {
        int left=0;
        int n=num.length;
        int right=n-1;
        while(left<right){
            int pair=num[left]+num[right];
            if(pair==target) return new int[]{left+1,right+1};
            else if(pair<target){
                left++;
            }
            else right--;
        }
        return new int[]{-1,-1};
    }
}