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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head= new ListNode(0);
        ListNode l3=head;
        
        int carry=0;
        while(l1!=null || l2!= null ){
            int first = (l1!=null)? l1.val :0;
            int second = (l2!=null)? l2.val :0;
            
            int sum = first+second+carry;
            
            carry= sum/10;
            int last = sum % 10;
            ListNode currentNode= new ListNode(last);
            l3.next=currentNode;
            
            if(l1!=null) l1=l1.next;
            if(l2!=null) l2=l2.next;
            l3=l3.next;
            
        }
        if(carry > 0){
            ListNode carryNode = new ListNode(carry);
            l3.next =carryNode;
            l3=l3.next;
        }
        return head.next;
        
    }
}
