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
    public ListNode[] splitListToParts(ListNode head, int k) {
        int count=0;
        ListNode temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        int parts=count/k;
        int left=count%k;
        ListNode []ans=new ListNode[k];
        temp=head;
        for(int i=0;i<k;i++){
            ans[i]=temp;
            int partSize = parts + (i < left ? 1 : 0);
            for (int j = 1; j < partSize && temp != null; j++) {
                temp = temp.next;
            }

            // Current part ko cut denge remaning se
            if (temp != null) {
                ListNode nextPart = temp.next;
                temp.next = null;
                temp = nextPart;
            }
        }
        return ans;

    }
}