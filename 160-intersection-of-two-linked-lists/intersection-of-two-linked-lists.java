/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempa=headA;
        ListNode tempb=headB;
        // int counta=0;
        // while(tempa!=null){
        //     counta++;
        //     tempa=tempa.next;
        // }
        // int countb=0;
        //  while(tempb!=null){
        //     countb++;
        //     tempb=tempb.next;
        // }
        // tempa=headA;
        // tempb=headB;
        // if(counta>countb){
        //     int steps=counta-countb;
        //     for(int i=1;i<=steps;i++){
        //         tempa=tempa.next;
        //     }
        // }
        // else{
        //    int steps=countb-counta;
        //     for(int i=1;i<=steps;i++){
        //         tempb=tempb.next;
        //     }
        // }
        // while(tempa!=tempb){
        //     tempa=tempa.next;
        //     tempb=tempb.next;
        // }
        // return tempb;


        while(tempa!=tempb){
            if(tempa==null){
                tempa=headB;
            }
            else tempa=tempa.next;
            if(tempb==null)tempb=headA;
            else tempb=tempb.next;

        }
        return tempa;
    }
}