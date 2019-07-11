package practice11;

public class Klass {
    private int number;
    private String displayName;
    private Student leader;
    private boolean isAppend=false;
    public Klass() {
    }

    public Klass(int number) {
        this.number = number;
        this.displayName="Class "+String.valueOf(number);
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

    public void assignLeader(Student student) {
        if (this.isAppend){
            this.setLeader(student);
        }
        else System.out.print("It is not one of us.\n");
    }

    public Student getLeader() {
        return leader;
    }

    public void setLeader(Student leader) {
        this.leader = leader;
    }

    public boolean isAppend() {
        return isAppend;
    }

    public void setAppend(boolean append) {
        isAppend = append;
    }

    public void appendMember(Student student) {
        this.isAppend=true;
    }
}
