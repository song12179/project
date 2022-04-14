package test.Node;
public class MyNode {
    int data;
    MyNode next;
    public MyNode(int data){
        this.data = data;
    }
    //添加后续节点
    public MyNode append(MyNode myNode){
        MyNode currentNode = this;
        while(true){
            MyNode nextNode = currentNode.next;
            if(nextNode == null){
                break;
            }
            currentNode = nextNode;
        }
        currentNode.next=myNode;
        return this;
    }
    //获取节点中的数据
    public int getData(){
        return this.data;
    }
    //获取下一个节点
    public MyNode next(){
        return this.next;
    }
    // 是否为最后一个节点
    public boolean isLast(){
        return this.next==null;
    }
    //查看所有的节点信息
    public void show(){
        MyNode currentNode =this;
        while(true){
            System.out.print("  " +currentNode.data);
            currentNode = currentNode.next;
            if(currentNode == null){
                break;
            }
        }
        System.out.println();
    }
    //删除下一个节点
    public void deletenextNode(){
        MyNode current = this;
        current.next = current.next.next;
    }
    //插入一个节点
    public void insertNode(MyNode node){
        MyNode currentNode = this;
        node.next = currentNode.next;
        currentNode.next = node;

    }
}
