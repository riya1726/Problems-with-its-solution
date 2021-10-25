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
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        if(head == null){
            return false;
        }
        while(fast != null) {
            fast = fast.next;
            if(fast == slow) {
                return true;
            }
            if(fast != null){
                fast = fast.next;
                slow = slow.next;
            }
        }
        return false;
    }
}
