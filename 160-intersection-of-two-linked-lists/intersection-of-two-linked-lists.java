import java.util.*;

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        HashSet<ListNode> set = new HashSet<>();

        ListNode temp = headB;

        while(temp != null){
            set.add(temp);   
            temp = temp.next;
        }

        ListNode temp2 = headA;

        while(temp2 != null){
            if(set.contains(temp2)){  
                return temp2;         
            }
            temp2 = temp2.next;
        }

        return null;
    }
}
