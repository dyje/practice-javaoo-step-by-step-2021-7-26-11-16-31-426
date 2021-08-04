package practice01;

public class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    String introduce(){
        return "My name is " + name+ ". I am " + age + " years old.";
    }
    public static void main(String[] args) {
        System.out.println(new Person("Tom", 21));
    }
}
