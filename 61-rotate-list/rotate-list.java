class Solution {
    public ListNode rotateRight(ListNode head, int k) {

        if (head == null  || k == 0)
            return head;

        ListNode head1 = head;
        ListNode head0 = head;

        int c = 0;
        ListNode temp1 = new ListNode(0);
        ListNode temp = temp1;

        while (head0 != null) {
            c++;
            head0 = head0.next;
        }

        k = k % c;
        if (k == 0) {
            return head;
        }

        int count = 0;

        while (head1 != null) {
            count++;
            if (count > c - k) {
                temp.next = head1;
                temp = temp.next;
            }
            head1 = head1.next;
        }

        count = 0;
        ListNode head2 = head;

        while (count < c - k) {
            temp.next = head2;
            temp = temp.next;
            head2 = head2.next;
            count++;
        }

        temp.next = null;
        return temp1.next;
    }
}
