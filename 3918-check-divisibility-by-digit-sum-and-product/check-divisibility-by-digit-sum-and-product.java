class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int product=1;
        int original=n;
        while(n>0){
            int rem=n%10;
            sum+=rem;
            product*=rem;
            n/=10;
        }
        int ans=sum+product;
        if(original%ans==0){
            return true;
        }
        else return false;

    }
}