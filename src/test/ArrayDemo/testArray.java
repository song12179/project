package test.ArrayDemo;

public class testArray {
    public static void main(String[] args) {
        Array array =new Array();
        array.add(6);
        array.show();
        array.add(7);
        array.show();
        array.delete(1);
        System.out.println(array.size());
        array.show();

        array.insert(1,9);
        array.show();
        array.insert(2,6);
        array.show();
        array.replace(1,5);
        array.show();
    }


}
