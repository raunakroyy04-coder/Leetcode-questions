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
    public ListNode mergeKLists(ListNode[] lists) {
      PriorityQueue<ListNode> pq=new PriorityQueue<>((a,b)->a.val-b.val);
      ListNode ans=new ListNode(0);
      for(ListNode node:lists){
        if(node!=null)pq.add(node);
      }
      ListNode curr=ans;
       while(!pq.isEmpty()){
        ListNode node=pq.remove();
        curr.next=node;
        curr=curr.next;

        if(node.next!=null){
            pq.add(node.next);
        }
       }
       return ans.next;

    }
}