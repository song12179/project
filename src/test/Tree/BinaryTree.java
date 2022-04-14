package test.Tree;

public class BinaryTree {
    TreeNode root;//根节点
    //设置根节点
    public void setRoot(TreeNode root){
        this.root = root;
    }
    //获取根节点方法
    public TreeNode getRoot(){
        return root;
    }
//前序遍历
    public void frontshow() {
        root.frontshow();
    }
//中序遍历
    public void middleshow() {
        root.middleshow();
    }
// 后序遍历
    public void aftershow() {
        root.aftershow();
    }

//前序查找
    public TreeNode frontSearch(int i) {
        return root.frontSearch(i);
    }
// 删除操作
    public void delete(int i) {
        if(root.value == i){
            root = null;
        }
        else{
            root.delete(i);
        }
    }
}
