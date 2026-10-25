class Solution {
    public int maxScore(int[] card, int k) {
        
        int n=card.length;
        int lsum=0;
        int rsum=0;
        int max=0;
        
        for(int i=0;i<k;i++){
            lsum+=card[i];
        }
            max=lsum;
            int j=n-1;
        for(int i=k-1;i>=0;i--){
            lsum-=card[i];
            lsum+=card[j];
            j--;
            if(lsum>max){
                max=lsum;
            }
        }
        return max;
    }
}