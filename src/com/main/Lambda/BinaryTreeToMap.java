package com.main.Lambda;

import java.util.HashMap;
import java.util.Map;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class BinaryTreeToMap {

    public static Map<Integer, Integer> treeToMapInorder(TreeNode root) {
        Map<Integer, Integer> map = new HashMap<>();
        inorderTraversal(root, 0, map);
        return map;
    }

    private static void inorderTraversal(TreeNode node, int level, Map<Integer, Integer> map) {
        if (node == null) {
            return;
        }
        inorderTraversal(node.left, level + 1, map);
        map.put(node.val, level);
        inorderTraversal(node.right, level + 1, map);
    }

    public static void main(String[] args) {
        // Example tree:
        //       1
        //      / \
        //     2   3
        //    / \
        //   4   5
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        Map<Integer, Integer> resultMap = treeToMapInorder(root);
        System.out.println(resultMap); // Output: {4=2, 2=1, 5=2, 1=0, 3=1}
        System.out.println(resultMap.keySet());
    }
}