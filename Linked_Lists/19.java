class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int numNodes = 0;
        ListNode curr = head;
        while (curr != null) {
            numNodes += 1;
            curr = curr.next;
        }
        if (numNodes == n) {
            return head.next;
        }

        int stepsToMove = numNodes - n - 1;
        curr = head;
        for (int i = 0; i < stepsToMove; i++) {
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return head;
    }
}
