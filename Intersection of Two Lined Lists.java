/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        int CountA = 1;
        int CountB = 1;
        
        while(temp1.next != null){
            CountA++;
            temp1 = temp1.next;
        }
        while(temp2.next != null){
            CountB++;
            temp2 = temp2.next;
        }
        
        temp1 = headA;
        temp2 = headB;
        
        if(CountA > CountB){
            int diff = CountA - CountB;
            for(int i=0; i<diff; i++){
                temp1 = temp1.next;
            }
        }
        if(CountB > CountA){
            int diff = CountB - CountA;
            for(int i=0; i<diff; i++){
                temp2 = temp2.next;
            }
        }
        while( temp1 != temp2){
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return temp1;
    }
}

                                                         OR
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> visited = new HashSet<>();
        while(headA != null){
            visited.add(headA);
            headA = headA.next;
        }
         while(headB != null){
            if(visited.contains(headB)){
                 return headB;
            }
            headB = headB.next;
         }
         return null;
    }
}                                                        
