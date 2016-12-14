//Runtime: 2 ms
//Your runtime beats 65.86% of java submissions.

public class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
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
        Collections.reverse(listList);
        return listList;
    }
}