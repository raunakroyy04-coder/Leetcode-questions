class Solution {
    public boolean sumGame(String num) {
        int n = num.length();
        
        int leftSum = 0;
        int rightSum = 0;
        int leftQ = 0;
        int rightQ = 0;
            //yaha se hum leftsum of leftQ nikal lenge
        for (int i = 0; i < n / 2; i++) {
            if (num.charAt(i) == '?')
                leftQ++;
            else
                leftSum += num.charAt(i) - '0';
        }
            //or yaha se hum rightsum or rightQ nikal lenge
        for (int i = n / 2; i < n; i++) {
            if (num.charAt(i) == '?')
                rightQ++;
            else
                rightSum += num.charAt(i) - '0';
        }

        int sumDiff = leftSum - rightSum;
        int qDiff = leftQ - rightQ;

        int value = 2 * sumDiff + 9 * qDiff;

        if (value == 0)
            return false;
        else
            return true;
    }
}