package test.Tree;

import java.util.Arrays;

public class TestBinaryTree {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        TreeNode treeNode = new TreeNode(1);
        binaryTree.setRoot(treeNode);
        TreeNode left = new TreeNode(2);
        treeNode.setLeftNode(left);
        TreeNode right = new TreeNode(3);
        treeNode.setRightNode(right);
        left.setLeftNode(new TreeNode(4));
        left.setRightNode(new TreeNode(5));
        right.setLeftNode(new TreeNode(6));
        right.setRightNode(new TreeNode(7));
        System.out.print("前序遍历为： ");
        binaryTree.frontshow();
        System.out.println();
        System.out.print("中序遍历为： ");
        binaryTree.middleshow();
        System.out.println();
        System.out.print("后序遍历为： ");
        binaryTree.aftershow();
        System.out.println();

        System.out.println(binaryTree.frontSearch(3));

        binaryTree.delete(5);
        System.out.print("删除后前序遍历为： ");
        binaryTree.frontshow();

    }
}
