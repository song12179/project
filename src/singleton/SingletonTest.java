package singleton;

public class SingletonTest {
    public static void main(String[] args) {
        Bank getbank = Bank.getbank();
        Bank getbank1 = Bank.getbank();
        System.out.println(getbank.equals(getbank1));

        Person person = Person.getPerson();
        Person person1 = Person.getPerson();
        System.out.println(person.equals(person1));



    }
}
//饿汉式
class Bank{
    private Bank(){
    }
    private static Bank bank = new Bank();
    public static Bank getbank(){
        return  bank;
    }
}

//懒汉式
class Person{
    private Person(){}
    private static Person person = null;
    public static Person getPerson(){
        if (person == null){
            person = new Person();
        }
        return person;
    }
}


