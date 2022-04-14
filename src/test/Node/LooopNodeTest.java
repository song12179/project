package test.Node;

public class LooopNodeTest {
    public static void main(String[] args) {
        LooopNode looopNode = new LooopNode(2);
        LooopNode looopNode1 = new LooopNode(6);
        LooopNode looopNode2 = new LooopNode(9);
        looopNode.insertNode(looopNode1);
        looopNode.insertNode(looopNode2);
        System.out.println(looopNode.getData());
        System.out.println(looopNode.next().getData());
        System.out.println(looopNode.next().next().getData());
        System.out.println(looopNode.next().next().next().getData());
    }


}
