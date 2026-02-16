class Solution {
    public ListNode partition(ListNode head, int x) {

        Queue<Integer> q = new LinkedList<>();

        // Step 1: Put all values into queue
        ListNode temp = head;
        while (temp != null) {
            q.add(temp.val);
            temp = temp.next;
        }

        Queue<Integer> left = new LinkedList<>();
        Queue<Integer> right = new LinkedList<>();

        
        while (!q.isEmpty()) {
            int val = q.poll();
            if (val < x) {
                left.add(val);
            } else {
                right.add(val);
            }
        }

        
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while (!left.isEmpty()) {
            curr.next = new ListNode(left.poll());
            curr = curr.next;
        }

        while (!right.isEmpty()) {
            curr.next = new ListNode(right.poll());
            curr = curr.next;
        }

        return dummy.next;
    }
}
