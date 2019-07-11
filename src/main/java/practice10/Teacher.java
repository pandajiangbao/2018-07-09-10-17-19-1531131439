package practice10;

import java.util.LinkedList;

public class Teacher extends Person {
    private LinkedList<Klass> classes;

    public Teacher(String name, int age, LinkedList<Klass> classes) {
        super(name, age);
        this.classes = classes;
    }

    public Teacher(int id, String name, int age, LinkedList<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
    }
    public Teacher(int id,String name, int age) {
        super(id,name,age);
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public String introduce() {
        String list="";
        if(this.classes!=null){
            for (int i=0;i<classes.size();i++) {
                if(i!=0){
                    list+=", ";
                }
                list+=String.valueOf(classes.get(i).getNumber());
            }
        }
        String string=this.classes!=null?"Class "+list+".":"No Class.";
        return super.introduce()+" I am a "+this.getClass().getSimpleName()+". I teach "+string;
    }

    public String introduceWith(Student student) {
        String string=this.classes.contains(student.getKlass())?"teach "+student.getName()+".":"don't teach "+student.getName()+".";
        return super.introduce()+" I am a Teacher. I "+string;
    }

    public LinkedList<Klass> getClasses() {
        return classes;
    }

    public void setClasses(LinkedList<Klass> classes) {
        this.classes = classes;
    }

    public boolean isTeaching(Student student) {
        for (int i=0;i<this.classes.size();i++){
            if (this.classes.get(i)==student.getKlass()) return  true;
        }
        return false;
    }
}
