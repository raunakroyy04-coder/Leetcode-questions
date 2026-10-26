class Solution {
    public int minimumCardPickup(int[] cards) {
        
        int min=Integer.MAX_VALUE;
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<cards.length;i++){
            int ele=cards[i];
            if(mp.containsKey(ele)){
                int len=i-mp.get(ele)+1;
                min=Math.min(min,len);
            }
            mp.put(ele,i);
            

        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}