package practice07;

public class Person {

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String name;
    public int age;

    public int getId() {
        return id;
    }

    public int id;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public boolean equals(Object object){
        if (object instanceof Person){
            return ((Person) object).getId() == this.getId();
        }
        return false;
    }

    public String introduce (){
        return "My name is " + name + ". I am " + age + " years old.";
    }
}
