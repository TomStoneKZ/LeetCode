//Runtime: 4 ms
//Your runtime beats 4.88% of java submissions.
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return null;

        Map<Integer, Integer> map = new HashMap<>();

        ListNode ptrl = head.next;
        map.put(head.val, 0);
        ListNode index = head;

        while (ptrl != null) {
            if(!map.containsKey(ptrl.val)) {
                index.next = ptrl;
                index = index.next;
                map.put(ptrl.val, 0);
            }
            ptrl = ptrl.next;
        }
        index.next = null;
        return head;
    }

    public static void main(String[] args) {
        ListNode node0 = new ListNode(1);
        node0.next = null;
//        ListNode node1 = new ListNode(1);
//        node0.next = node1;
//        ListNode node2 = new ListNode(2);
//        node1.next = node2;
//        ListNode node3 = new ListNode(3);
//        node2.next = node3;
//        ListNode node4 = new ListNode(3);
//        node3.next = node4;
//        node4.next = null;

        ListNode head = new Solution().deleteDuplicates(node0);
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
}
