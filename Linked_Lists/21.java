/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode temp1, ListNode temp2) {

        if (temp1 == null)
            return temp2;
        else if (temp2 == null) {
            return temp1;
        } else if (temp1 == null && temp2 == null) {
            return null;
        }
        ListNode curr = new ListNode(-1);
        ListNode head = curr;
        while (temp1 != null && temp2 != null) {
            if (temp1.val <= temp2.val) {
                curr.next = temp1;
                temp1 = temp1.next;
            } else {
                curr.next = temp2;
                temp2 = temp2.next;
            }
            curr = curr.next;
        }
        if (temp1 != null) {
            curr.next = temp1;
        } else {
            curr.next = temp2;
        }
        return head.next;
    }
}