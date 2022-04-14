package test.Node;

public class MyNodeTest {
    public static void main(String[] args) {
        MyNode myNode =new MyNode(5);
        MyNode myNode1=new MyNode(6);
        MyNode myNode2=new MyNode(8);
        myNode.append(myNode1);
        myNode.append(myNode2);
        System.out.println(myNode.next().getData());
        System.out.println(myNode.next().isLast());
        myNode.show();
        myNode.deletenextNode();
        myNode.show();
        myNode.insertNode(new MyNode(9));
        myNode.show();


    }
}
