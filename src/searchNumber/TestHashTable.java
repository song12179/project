//package searchNumber;
//
//import java.util.Scanner;
//public class TestHashTable {
//    HashTable hashTable =new HashTable();
//    public static void main(String[] args) {
//
//        System.out.println("————————用户信息录入————————");
//        for(int i =1;i<100;i++){
//        System.out.println("请输入第"+i+"用户姓名：");
//        Scanner scanner =new Scanner(System.in);
//        String name = scanner.nextLine();
//        System.out.println("请输入第"+i+"用户的号码：");
//        Integer number = scanner.nextInt();
//        System.out.println("按“1”继续录入，按0退出录入！");
//        Integer exit = scanner.nextInt();
//        if(exit == 0){
//            break;
//        }
//        }
//        while(true){
//
//        System.out.println("---------用户电话号码查询系统----------");
//        System.out.println("1.根据姓名查找用户信息");
//        System.out.println("2.根据号码查找用户信息");
//        System.out.println("3.插入新的用户号码信息");
//        System.out.println("4.根据号码删除用户信息");
//        System.out.println("5.根据姓名删除用户信息");
//        System.out.println("6.显示所有的用户信息");
//        System.out.println("7.退出系统");
//        System.out.println("-------------------------------------");
//        System.out.println("请选择您需要功能的编号：");
//
//        Scanner scanner1 =new Scanner(System.in);
//        Integer scn = scanner1.nextInt();
//
//        switch (scn){
//            case 1:
//                System.out.println("请输入要查找用户信息的名字：");
//                Scanner sa = new Scanner(System.in);
//                String s = sa.nextLine();
//
////                hashTable.getByname();
//                break;
//            case 2:
//                System.out.println("请输入要查找用户信息的号码：");
//                Scanner bb = new Scanner(System.in);
//                int number =bb.nextInt();
//                hashTable.getBynumber(number);
//                break;
//            case 3:
//                System.out.println("请输入要插入信息用户的姓名:");
//                Scanner ff = new Scanner(System.in);
//                String name = ff.nextLine();
//                System.out.println("请输入要插入信息用户的号码:");
//                int numbe = ff.nextInt();
//                UserNumber userNumber =new UserNumber(numbe,name);
//                hashTable.put(userNumber);
//                break;
//            case 4:
//                System.out.println("请输入要删除的用户的号码：");
//                Scanner cc =new Scanner(System.in);
//                int c = cc.nextInt();
//                hashTable.deleteBynumber(c);
//                break;
//            case 5:
//                System.out.println("请输入要删除的用户的名字：");
//                Scanner dd =new Scanner(System.in);
//                String d = dd.nextLine();
//                hashTable.deleteByname(d);
//                break;
//            case 6:
//                hashTable.list();
//                break;
//            case 7:
//                System.out.println("欢迎再次使用！");
//                System.exit(0);
//        }
//        }
//
//    }
//}
