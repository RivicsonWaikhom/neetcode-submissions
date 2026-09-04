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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode curr= head;
        int len=0;
        // find len
        while(curr!=null){
            len++;
            curr=curr.next;
        }
        curr=head;//initialise curr to head again coz curr is at null
        
        //position of the element to be deleted from left
        int pos=len-n;
        if(pos==0) return head.next;
        for(int i=1;i<pos;i++){
            curr=curr.next;
        }
        curr.next=curr.next.next;
        return head;
    }
}
