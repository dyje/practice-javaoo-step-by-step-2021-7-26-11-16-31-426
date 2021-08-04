package practice04;

public class Person {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String introduce (){
        return "Hi my name is " + name + "I am " + age + " years old.";
    }
}
