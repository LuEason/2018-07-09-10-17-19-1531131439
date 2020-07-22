package practice11;

import java.util.ArrayList;
import java.util.List;

public class Klass {

    private Integer number;

    private String displayName;

    private Student leader;

    private List<JoinListener> listeners;

    public Klass(Integer number) {
        this.number = number;
        this.displayName = "Class " + this.number;
        this.listeners = new ArrayList<JoinListener>();
    }

    public void register(JoinListener listener) {
        listeners.add(listener);
    }

    public Student getLeader() {
        return leader;
    }

    public void assignLeader(Student student) {
        if (student.getKlass().getNumber() != number) {
            System.out.print("It is not one of us.\n");
        } else {
            this.leader = student;
            for (JoinListener listener : listeners) {
                listener.notifiedLeaderAssign(student);
            }
        }
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public void appendMember(Student student) {
        student.setKlass(this);
        for (JoinListener listener : listeners) {
            listener.notifiedMemberAppend(student);
        }
    }
}
