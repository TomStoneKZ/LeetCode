//Runtime: 2 ms
//Your runtime beats 7.70% of java submissions.

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int level = 1;
        int depth = 0;

        while (!queue.isEmpty()) {
            int count = 0;
            depth++;
            while (level-- != 0) {
                TreeNode node = queue.poll();
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
        }
        return depth;
    }
}
