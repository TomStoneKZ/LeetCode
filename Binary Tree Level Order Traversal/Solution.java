//Runtime: 2 ms
//Your runtime beats 35.14% of java submissions.
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List listList = new ArrayList<List<Integer>>();
        if(root == null) return listList;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int level = 1;
        while (!queue.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            int count = 0;
            while (level-- != 0) {
                TreeNode node = queue.poll();
                list.add(node.val);
                if(node.left != null) {
                    queue.add(node.left);
                    count++;
                }
                if(node.right != null) {
                    queue.add(node.right);
                    count++;
                }
            }
            level = count;
            listList.add(list);
        }
        return listList;
    }
}
