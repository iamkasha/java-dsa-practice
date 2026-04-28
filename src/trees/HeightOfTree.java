package trees;

/*
 * Height of a Binary Tree
 * Height = number of edges on the longest path from root to a leaf.
 * Time: O(n)  Space: O(h) where h = tree height
 */
public class HeightOfTree {

    public static int height(TreeNode root) {
        if (root == null) return -1;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public static void main(String[] args) {
        /*
         *       1
         *      / \
         *     2   3
         *    /
         *   4
         */
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);

        System.out.println("Height: " + height(root)); // 2
        System.out.println("Height of null: " + height(null)); // -1
    }
}
