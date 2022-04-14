package test.Tree;

import java.util.Arrays;

public class TreeNode {
    int value;//节点的值
    //左孩子
    TreeNode leftNode;
    //右孩子
    TreeNode rightNode;
    //节点的构造方法
    public  TreeNode(int value){
        this.value = value;
    }
    //左孩子的构造方法
    public void setLeftNode(TreeNode leftNode){
        this.leftNode = leftNode;
    }
    //右孩子的构造方法
    public void setRightNode(TreeNode rightNode){
        this.rightNode = rightNode;
    }
    // 前序遍历  根->左节点->右节点
    public void frontshow() {
        System.out.print("  " + value);
        if(leftNode != null){
            leftNode.frontshow();
        }
        if(rightNode != null){
            rightNode.frontshow();
        }
    }
    // 中序遍历  左节点->根节点->右节点
    public void middleshow() {
        if(leftNode != null){
            leftNode.middleshow();
        }
        System.out.print("  " + value);

        if(rightNode != null){
            rightNode.middleshow();
        }
    }
    // 后序遍历  左节点->右节点->根节点
    public void aftershow() {
        if(leftNode != null){
            leftNode.aftershow();
        }
        if(rightNode != null){
            rightNode.aftershow();
        }
        System.out.print("  " + value);
    }

//前序查找
    public TreeNode frontSearch(int i) {
        TreeNode target = null;
        //判断当前值是否等于i
        if (this.value == i){
            return this;
        }
        //如果不等于
        else{
            //如果左节点的值不为null，继续查找左节点及其子节点
            if (leftNode!=null){
                target = leftNode.frontSearch(i);
            }
            //如果不为空，说明在左子树中已经找到了
            if(target != null){
                return  target;
            }
            //查找右节点及其子节点
            if(rightNode != null){
                target = rightNode.frontSearch(i);
            }
        }
        return target;
    }
// 删除操作
    public void delete(int i) {
        TreeNode parent = this;
        if(parent.leftNode !=null && parent.leftNode.value ==i){
            parent.leftNode = null;
            return;
        }
        if (parent.rightNode !=null && parent.rightNode.value ==i){
            parent.rightNode = null;
            return;
        }
        parent = leftNode;
        if (parent != null){
            parent.delete(i);
        }
        parent = rightNode;
        if (parent!= null){
            parent.delete(i);
        }

    }
}
