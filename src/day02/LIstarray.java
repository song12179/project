package day02;

import java.util.ArrayList;
import java.util.List;

public class LIstarray {
    public static void main(String[] args){
        Student student = new Student("李敏",23,456123);
        Student student1 = new Student("李敏那",23,456123);
        List<Student> list = new ArrayList();
        list.add(student);
        list.add(student1);
        System.out.println(list);
        for(int i = 0; i< list.size();i++){
            System.out.println(list);
        }
    }
}
class Student{
    private String name;
    private int age;
    private Integer id;

    Student(){

    }
    Student(String name,int age,Integer id){
        this.name = name;
        this.age = age;
        this.id = id;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}
