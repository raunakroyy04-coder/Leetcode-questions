class Solution {
    public int missingMultiple(int[] nums, int k) {
        
        // for(int j=k; ;j+=k){
        //     boolean found=false;
        //     for(int i=0;i<nums.length;i++){
        //         if(nums[i]==j){
        //          found=true;
        //         break;
        //         }
        //     }
        //     if(!found){
        //      return j;
        //     }
        // }


        HashSet<Integer> st=new HashSet<>();
        for(int num:nums){
            st.add(num);
        }
        int j=k;

        while(st.contains(j)){
            j+=k;
        }
        return j;
    }
}