package practice11;

import java.util.LinkedList;

public class Teacher extends Person implements JoinListener {
    private Integer id;

    private LinkedList<Klass> classes;

    public Teacher(Integer id, String name, Integer age) {
        super(id, name, age);
    }

    public Teacher(Integer id, String name, Integer age, LinkedList<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
        for (Klass klass : classes) {
            klass.register(this);
        }
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public LinkedList<Klass> getClasses() {
        return classes;
    }

    public void setClasses(LinkedList<Klass> classes) {
        this.classes = classes;
        for (Klass klass : classes) {
            klass.register(this);
        }
    }

    @Override
    public String introduce() {
        if (classes != null) {
            String result = super.introduce() + " I am a Teacher. I teach Class ";
            for (Klass klass : classes) {
                result += klass.getNumber();
                result += ", ";
            }
            result = result.substring(0, result.length() - 2);
            result += ".";
            return result;
        } else {
            return super.introduce() + " I am a Teacher. I teach No Class.";
        }
    }

    public String introduceWith(Student student) {
        if (isTeaching(student)) {
            return super.introduce() + " I am a Teacher. I teach " + student.getName() + ".";
        } else {
            return super.introduce() + " I am a Teacher. I don't teach " + student.getName() + ".";
        }
    }

    public Boolean isTeaching(Student student) {
        return classes.contains(student.getKlass());
    }

    @Override
    public void notifiedMemberAppend(Student student) {
        System.out.print("I am " + name + ". I know " + student.getName() + " has joined Class " + student.getKlass().getNumber() + ".\n");
    }

    @Override
    public void notifiedLeaderAssign(Student student) {
        System.out.print("I am " + name + ". I know " + student.getName() + " become Leader of Class " + student.getKlass().getNumber() + ".\n");
    }
}
