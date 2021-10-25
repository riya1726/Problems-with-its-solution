/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null) {
            slow = slow.next;
            fast = fast.next;
            if(fast == null) {
                return null;
            }
            fast = fast.next;
            if(slow == fast) {
                break;
            }
        }
        if(fast == null) {
            return null;
        }
        ListNode begin = head;
        while(begin != slow){
            begin = begin.next;
            slow = slow.next;
        }
        return slow;
    }
}
