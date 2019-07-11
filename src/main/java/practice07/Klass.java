package practice07;

public class Klass {
    private int number;
    private String displayName;

    public Klass() {
    }

    public Klass(int number) {
        this.number = number;
    }

    public Klass(int number, String displayName) {
        this.number = number;
        this.displayName = displayName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
}
