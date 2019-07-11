package practice11;

import java.util.List;

public class Klass {
    private int number;
    private String displayName;
    private Student leader;
    private Teacher teacher;
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

    public Student getLeader() {
        return leader;
    }

    public void setLeader(Student leader) {
        this.leader = leader;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    public boolean isIn(Student student){
        if(student.getKlass()!=null&&student.getKlass().getNumber() == this.number){
            return true;
        }
        return false;
    }

    public void appendMember(Student student){
        student.setKlass(this);
        if (this.teacher!=null) {
            this.teacher.studentAppend(this, student);
        }
    }

    public void assignLeader(Student student) {
        if (student.getKlass().number == this.number){
            this.setLeader(student);
            if (this.teacher!=null){
                this.teacher.studentLeader(this,student);
            }
        }
        else System.out.print("It is not one of us.\n");
    }

}
