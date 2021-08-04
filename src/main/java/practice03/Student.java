package practice03;

public class Student extends Person{

    public void setKlass(int klass) {
        this.klass = klass;
    }

    int klass;
    public Student(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }
    public int getKlass() {
        return klass;
    }

    String introduce(){
        return "I am a Student" + ". I am at Class " + klass + ".";
    }
}
