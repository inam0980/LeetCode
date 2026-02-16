
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ArrayList<Integer> lst= new ArrayList<>();

        while(list1!=null){
            lst.add(list1.val);
            list1=list1.next;
        }
        while(list2!=null){
            lst.add(list2.val);
            list2=list2.next;
        }

        Collections.sort(lst);
        
        ListNode head1=new ListNode();

        ListNode head2=head1;

        for(int x:lst){
            ListNode newnode= new ListNode(x);
            head2.next=newnode;
            head2=head2.next;


        }

        return head1.next;

        
    }
}