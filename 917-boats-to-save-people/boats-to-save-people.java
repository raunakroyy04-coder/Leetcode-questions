class Solution {
    public int numRescueBoats(int[] pep, int limit) {
        int i=0;
     int j=pep.length-1;
     int count=0;
     Arrays.sort(pep);
     while(i<=j){
        int sum=pep[i]+pep[j];
        if(sum<=limit){
            i++;
        }
        j--;
        count++;
     }
     return count;
    }
}