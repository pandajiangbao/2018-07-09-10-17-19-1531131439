package practice08;

public class Teacher {
    private int Number;
    private String name;
    private int age;
    private Klass klass;

    public Teacher(String name, int age, Klass klass) {
        this.name = name;
        this.age = age;
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Teacher(int Number, String name, int age, Klass klass) {
        this.Number = Number;
        this.name = name;
        this.age = age;
        this.klass = klass;
    }

    public Teacher(int Number, String name, int age) {
        this.Number = Number;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public String introduce() {
        String string=this.klass!=null?this.klass.getDisplayName()+".":"No Class.";
        return "My name is "+this.name+". I am "+this.age+" years old. I am a "+this.getClass().getSimpleName()+". I teach "+string;
    }

    public String introduceWith(Student jerry) {
        String string=this.klass.getNumber()!=jerry.getKlass().getNumber()?"don't teach "+jerry.getName()+".":"teach "+jerry.getName()+".";
        return "My name is "+this.name+". I am "+this.age+" years old. I am a Teacher. I "+string;
    }
}
