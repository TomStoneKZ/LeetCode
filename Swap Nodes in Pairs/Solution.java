public class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode start = new ListNode(0);
        start.next = head;
        ListNode ptr = start;
        while (head !=null && head.next != null) {
            ptr.next = head.next;
            head.next = head.next.next;
            ptr.next.next = head;
            ptr = head;
            head = head.next;
        }
        start = start.next;
        return start;
    }

    public static void main(String[] args) {
        int max = 4;
        ListNode[] listNodes = new ListNode[max];
        listNodes[0] = new ListNode(1);
        for(int i=1; i<max; i++) {
            listNodes[i] = new ListNode(i+1);
            listNodes[i].next = null;
            listNodes[i-1].next = listNodes[i];
        }

       ListNode node = new Solution().swapPairs(listNodes[0]);
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }
}
