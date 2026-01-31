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
    public ListNode revLinkedList(ListNode head){
        ListNode before = null;
        ListNode curr = head;
        while(curr!=null){
            ListNode after = curr.next;
            curr.next = before;
            before = curr;
            curr = after;
        }
        return before;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head1 = l1;
        ListNode head2 = l2; 
        ListNode resHead = null;
        int carry = 0;

        while(head1!=null || head2!=null || carry>0){
            int v1 = (head1!=null) ? head1.val : 0;
            int v2 = (head2!=null) ? head2.val : 0;
            int sum = v1+v2+carry;
            carry = sum/10;
            int digit = sum%10;

            ListNode newNode = new ListNode(digit);
            newNode.next = resHead;
            resHead = newNode;

            if (head1 != null) head1 = head1.next;
            if (head2 != null) head2 = head2.next;

        }

        return revLinkedList(resHead);

      
        
    }
}
