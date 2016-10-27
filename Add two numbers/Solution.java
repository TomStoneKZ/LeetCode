
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode L1, ListNode L2) {
        int flag = 0;
        ListNode l1 = L1;
        ListNode l2 = L2;
        ListNode listNode = new ListNode(0);
        listNode.next = null;
        ListNode ptr = listNode;
        while(l1 != null && l2 != null) {
            ListNode l = new ListNode((l1.val + l2.val + flag)%10);
            l.next = null;
            ptr.next = l;
            ptr = ptr.next;
            flag = (l1.val + l2.val + flag)/10;
            l1 = l1.next;
            l2 = l2.next;
        }
        if(l1 != null) {
            while (l1 != null) {
                ListNode l = new ListNode((l1.val + flag)%10);
                l.next = null;
                ptr.next = l;
                ptr = ptr.next;
                flag = (l1.val + flag)/10;
                l1 = l1.next;
            }
        }else if(l2 != null) {
            while (l2 != null) {
                ListNode l = new ListNode((l2.val + flag)%10);
                l.next = null;
                ptr.next = l;
                ptr = ptr.next;
                flag = (l2.val + flag)/10;
                l2 = l2.next;
            }
        }
        if(flag > 0) {
            ListNode l = new ListNode(flag);
            l.next = null;
            ptr.next = l;
        }
        listNode = listNode.next;
        return listNode;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(4);
        l1.next = l2;
        ListNode l3 = new ListNode(3);
        l2.next = l3;
        l3.next = null;
        ListNode l4 = new ListNode(5);
        ListNode l5 = new ListNode(6);
        l4.next = l5;
        ListNode l6 = new ListNode(4);
        l5.next = l6;
        l6.next = null;
        ListNode l = solution.addTwoNumbers(l1, l4);
        while (l != null) {
            System.out.print(l.val + " ");
            l = l.next;
        }
        System.out.println();

    }
}
