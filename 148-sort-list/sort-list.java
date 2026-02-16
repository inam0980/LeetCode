
class Solution {
    public ListNode sortList(ListNode head) {

        ArrayList<Integer> lst=new ArrayList<>();

        while(head!=null){
            lst.add(head.val);
            head=head.next;
        }
        Collections.sort(lst);

        ListNode temp=new ListNode(0);
        ListNode temp2=temp;

        for(int x: lst){
            ListNode newnode= new ListNode(x);
            temp2.next=newnode;
            temp2=temp2.next;
        }
        return temp.next;
        
    }
}