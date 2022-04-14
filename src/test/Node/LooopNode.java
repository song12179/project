package test.Node;

public class LooopNode {
    int data;
    LooopNode next = this;

    public LooopNode(int data) {
        this.data = data;
    }

    //获取节点中的数据
    public int getData() {
        return this.data;
    }

    //获取下一个节点
    public LooopNode next() {
        return this.next;
    }

    // 是否为最后一个节点
    public boolean isLast() {
        return this.next == null;
    }

    //删除下一个节点
    public void deletenextNode() {
        LooopNode current = this;
        current.next = current.next.next;
    }

    //插入一个节点
    public void insertNode(LooopNode node) {
        LooopNode currentNode = this;
        node.next = currentNode.next;
        currentNode.next = node;

    }
}
