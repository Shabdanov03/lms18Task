import java.util.Arrays;

public  class Person  {
    private String name;
    private int age;

    public Person(String name,int age) {
        this.name = name;
        this.age=age;
    }

    public int getAddress() {
        return age;
    }

    public void setAddress(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return " name = " + name + '\'' + " age = " + age;
    }

}
