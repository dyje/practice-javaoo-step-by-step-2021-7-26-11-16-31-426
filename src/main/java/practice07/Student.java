package practice07;

public class Student extends Person {

    public Klass getKlass() {
        return klass;
    }

    private Klass klass;
    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public String introduce(){
        return super.introduce() + " I am a Student. I am at Class " + klass.getNumber() + ".";
    }
}
