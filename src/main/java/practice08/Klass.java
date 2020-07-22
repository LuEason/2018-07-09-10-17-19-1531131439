package practice08;

public class Klass {

    private Integer number;

    private String displayName;

    private Student leader;

    public Klass(Integer number) {
        this.number = number;
        this.displayName = "Class " + this.number;
    }

    public Student getLeader() {
        return leader;
    }

    public void assignLeader(Student leader) {
        this.leader = leader;
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
}
