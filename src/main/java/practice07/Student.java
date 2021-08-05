package practice07;

import java.text.MessageFormat;

public class Student extends Person {
    private Klass klass;

    public Klass getKlass() {
        return klass;
    }

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public String introduce() {
        String student = super.introduce() + " " + "I am a Student. ";
        if (klass.getLeader() != null) {
            return String.format(student + "I am Leader of Class %s.", klass.getNumber());
        } else
            return String.format(student + "I am at Class %s.", klass.getNumber());

    }

}
