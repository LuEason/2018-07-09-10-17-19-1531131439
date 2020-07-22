package practice07;

public class Klass {

    private Integer number;

    private String displayName;

    public Klass(Integer number) {
        this.number = number;
        this.displayName = "Class " + this.number;
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
