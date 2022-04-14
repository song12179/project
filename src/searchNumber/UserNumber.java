package searchNumber;

public class UserNumber {
    private int number;
    private String name;

    public int hashCode(){
        int a = number/1000000000;
        int b = number%1000000000/100000000;
        int c = number%100000000/10000000;
        int d = number%10000000/1000000;
        int e = number%1000000/100000;
        int f = number%100000/10000;
        int g = number%10000/1000;
        int h = number%1000/100;
        int i = number%100/10;
        int j = number%10;
        int aa = (a+b+c+d+e+f+g+h+i+j)%5;
        return aa;
    }

    public UserNumber() {
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserNumber(int number, String name) {
        this.number = number;
        this.name = name;

    }


    @Override
    public String toString() {
        return "UserNumber{" +
                "number=" + number +
                ", name='" + name + '\'' +
                '}';
    }
}

