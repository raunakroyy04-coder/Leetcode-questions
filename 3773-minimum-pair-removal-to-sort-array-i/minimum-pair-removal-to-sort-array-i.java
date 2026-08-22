class Solution {
    public int minimumPairRemoval(int[] nums) {
        //phele ek arraylist bnye
        ArrayList<Integer> list = new ArrayList<>();
        //fir uske baad me array ke data ko array list me store kiye
        for (int x : nums) {
            list.add(x);
        }

        int count = 0;
        //check kiye desending me to h nahi n 
        //agar h tab ye process karenge
        while (!isSorted(list)) {
            int minSum = Integer.MAX_VALUE;
            int index = 0;

            for (int i = 0; i < list.size() - 1; i++) {
                int sum = list.get(i) + list.get(i + 1);

                if (sum < minSum) {
                    minSum = sum;
                    index = i;
                }
            }

            list.set(index, minSum);
            list.remove(index + 1);

            count++;
        }

        return count;
    }
//check yah se karenge;
    private boolean isSorted(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                return false;
            }
        }
        return true;
    }
}