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
        ListNode m1 = l1, m2 = l2;
        ListNode resultNode = new ListNode();
        ListNode node = resultNode;
        int sum, carry, val1, val2;
        while(true) {
            val1 = m1!=null?m1.val:0;
            val2 = m2!=null?m2.val:0;
            sum = val1 + val2;
            carry = sum / 10;
            node.val += sum % 10;
            carry += node.val / 10;
            node.val %= 10;

            m1 = m1!=null?m1.next:null;
            m2 = m2!=null?m2.next:null;

            if(m1 != null || m2 != null || carry != 0) {
                node.next = new ListNode(carry);
                node = node.next;
            } else {
                break;
            }
        }
        return resultNode;
    }
}