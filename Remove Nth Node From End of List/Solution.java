import java.util.HashMap;
import java.util.Map;

/**
 * Created by wbshi on 2016/11/16 0016.
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        Map<Integer, ListNode> map = new HashMap<>();
        ListNode ptrl = head;
        int i = 1;
        while(ptrl != null) {
            map.put(i++, ptrl);
            ptrl = ptrl.next;
        }
        if(i-n != 1) {
            map.get(i-n-1).next = map.get(i-n+1);
        }else if(map.size()!=1) {
            head = map.get(2);
        }else {
            head = null;
        }
        return head;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        node1.next = node2;
        ListNode node3 = new ListNode(3);
        node2.next = node3;
        ListNode node4 = new ListNode(4);
        node3.next = node4;
        ListNode node5 = new ListNode(5);
        node4.next = node5;
        node5.next = null;
        ListNode node = solution.removeNthFromEnd(node1, 2);
        while (node!=null) {
            System.out.print(node.val);
            node = node.next;
        }

    }
}
