class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode temp1 = new ListNode(0);
        ListNode temp = temp1;

        int x2 = 0;   

        while (l1 != null || l2 != null) {

            int x = x2;   

            if (l1 != null) {
                x = x + l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                x = x + l2.val;
                l2 = l2.next;
            }

            int x1 = x % 10;  
            x2 = x / 10;       

            ListNode newnode = new ListNode(x1);
            temp.next = newnode;
            temp = temp.next;
        }

        
        if (x2 != 0) {
            temp.next = new ListNode(x2);
        }

        return temp1.next;
    }
}
