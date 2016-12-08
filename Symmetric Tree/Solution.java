public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        if(isEqual(root.left, root.right)) return true;
        return false;
    }

    public boolean isEqual(TreeNode p, TreeNode q) {
        if(p==null || q==null) return p==q;
        if(p.val != q.val) return false;
        if(!isEqual(p.left, q.right) || !isEqual(p.right, q.left)) return false;
        return true;
    }

    public static void main(String[] args) {
        TreeNode node0 = new TreeNode(1);
        TreeNode node11 = new TreeNode(2);
        TreeNode node12 = new TreeNode(2);
        TreeNode node21 = new TreeNode(3);
        TreeNode node22 = new TreeNode(4);
        TreeNode node23 = new TreeNode(4);
        TreeNode node24 = new TreeNode(3);

        node0.left = node11;
        node0.right = node12;

        node11.left = node21;
        node11.right = node22;

        node12.left = node23;
        node12.right = node24;

        node21.left = null;
        node22.left = null;
        node23.left = null;
        node24.left = null;

        node21.right = null;
        node22.right = null;
        node23.right = null;
        node24.right = null;

        System.out.println(new Solution().isSymmetric(node0));

    }
}
