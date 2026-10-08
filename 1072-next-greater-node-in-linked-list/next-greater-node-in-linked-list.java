/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        
        ArrayList<Integer> store=new ArrayList<>();
        while(head!=null){
            store.add(head.val);
            head=head.next;
        }
        int n=store.size();
        int ans[]=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){

            while(!st.isEmpty()&&st.peek()<=store.get(i)){
                st.pop();
            }

            if (!st.isEmpty()) {
                ans[i] = st.peek();
            }



            st.push(store.get(i));

        }
        return ans;
    }
}