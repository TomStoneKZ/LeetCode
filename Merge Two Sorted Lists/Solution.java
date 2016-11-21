public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode ptr = head;
        if(l1==null && l2==null) return null;
        if(l1==null) return l2;
        if(l2==null) return l1;

        while(l1!=null && l2!=null) {
            if(l1.val < l2.val) {
                ptr.next = l1;
                l1 = l1.next;
            }
            else {
                ptr.next = l2;
                l2 = l2.next;
            }
            ptr = ptr.next;
        }
        while (l1 != null) {
            ptr.next = l1;
            l1 = l1.next;
            ptr = ptr.next;
        }
        while (l2 != null) {
            ptr.next = l2;
            l2 = l2.next;
            ptr = ptr.next;
        }
        head = head.next;
        return head;
    }

    public static void main(String[] args) {
        int max = 5;
        int i;
        ListNode[] nodes1 = new ListNode[max];
        ListNode[] nodes2 = new ListNode[max];
        nodes1[0] = new ListNode(1);
        nodes2[0] = new ListNode(2);
        for(i=1; i<max; i++) {
            nodes1[i] = new ListNode(2*i+1);
            nodes1[i-1].next = nodes1[i];
            nodes2[i] = new ListNode(2*i+2);
            nodes2[i-1].next = nodes2[i];
        }
        nodes1[i-1].next = null;
        nodes2[i-1].next = null;
        ListNode node = new Solution().mergeTwoLists(nodes1[0], nodes2[0]);
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }
}
