package practice06;

import practice05.Person;

import java.text.MessageFormat;

public class Teacher extends Person {

    public Klass getKlass() {
        return klass;
    }
    public Klass klass;

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
    }
    public String introduce(){
        if (this.getKlass() == null){
            return super.introduce() + " I am a Teacher. " + "I teach No Class.";
        }else
            return super.introduce() + " I am a Teacher. " + "I teach Class " + klass.getNumber() + ".";
    }

    public String introduceWith(Student student){
        String teacher = super.introduce() + " " + "I am a Teacher. ";
        if (student.getKlass().getNumber() == (this.getKlass().getNumber())) {
            return MessageFormat.format("{0}" + "I teach {1}.",teacher, student.getName());
        }else{
            return MessageFormat.format("{0}" + "I don't teach {1}.",teacher, student.getName());
        }
    }

//    String teacherIntro = super.introduce() + " " + "I am a Teacher. ";
//    String studentName = student.getName();
//    return student.getKlass().getNumber().equals(this.getKlass().getNumber()) ?
//    teacherIntro + String.format("I teach %s.", studentName) : teacherIntro + String.format("I don't teach %s.", studentName);
//
//    "My name is Tom. I am 21 years old. I am a Teacher. I teach Jerry."
//
//            //return MessageFormat.format("My name is {0}. I am {1} years old.", name, age);
//            //String.format("My name is %s. I am %d years old.", name, age);
}
