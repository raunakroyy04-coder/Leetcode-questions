class Solution {
    public int hammingDistance(int x, int y) {
        int ok=x^y;
        int count=0;
        while(ok!=0){
            count+=ok&1;
            ok=ok>>1;
        }
        return count;
    }
}