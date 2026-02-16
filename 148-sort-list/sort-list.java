class Solution {
    public ListNode sortList(ListNode head) {

        ArrayList<Integer> lst = new ArrayList<>();

        while (head != null) {
            lst.add(head.val);
            head = head.next;
        }

        Collections.sort(lst);

        ListNode temp = new ListNode(0);
        ListNode temp2 = temp;

        for (int x : lst) {
            temp2.next = new ListNode(x);
            temp2 = temp2.next;
        }

        return temp.next;
    }
}
