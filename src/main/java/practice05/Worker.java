package practice05;

public class Worker extends Person {

    public Worker(String name, int age) {
        super(name, age);
    }

    @Override
    public String introduce() {
        return super.introduce()+" I am a "+this.getClass().getSimpleName()+". I have a job.";
    }
}
