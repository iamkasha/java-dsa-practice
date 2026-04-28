package trees;

import java.util.ArrayList;
import java.util.List;

/*
 * Binary Tree Traversals — Inorder, Preorder, Postorder (recursive)
 * Inorder:   Left → Root → Right  (gives sorted order for BST)
 * Preorder:  Root → Left → Right  (useful for tree copying)
 * Postorder: Left → Right → Root  (useful for tree deletion)
 * Time: O(n)  Space: O(h) where h = tree height
 */
public class BinaryTreeTraversals {

    public static List<Integer> inorder(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorderHelper(root, result);
        return result;
    }

    public static List<Integer> preorder(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preorderHelper(root, result);
        return result;
    }

    public static List<Integer> postorder(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postorderHelper(root, result);
        return result;
    }

    private static void inorderHelper(TreeNode node, List<Integer> result) {
        if (node == null) return;
        inorderHelper(node.left, result);
        result.add(node.val);
        inorderHelper(node.right, result);
    }

    private static void preorderHelper(TreeNode node, List<Integer> result) {
        if (node == null) return;
        result.add(node.val);
        preorderHelper(node.left, result);
        preorderHelper(node.right, result);
    }

    private static void postorderHelper(TreeNode node, List<Integer> result) {
        if (node == null) return;
        postorderHelper(node.left, result);
        postorderHelper(node.right, result);
        result.add(node.val);
    }

    public static void main(String[] args) {
        /*
         *       1
         *      / \
         *     2   3
         *    / \
         *   4   5
         */
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println("Inorder:   " + inorder(root));   // [4, 2, 5, 1, 3]
        System.out.println("Preorder:  " + preorder(root));  // [1, 2, 4, 5, 3]
        System.out.println("Postorder: " + postorder(root)); // [4, 5, 2, 3, 1]
    }
}
