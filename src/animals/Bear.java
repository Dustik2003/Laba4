package animals;

public class Bear extends Animal{
    private String location;

    public String getLocation() {
        return location;
    }

    public Bear(){}
    public Bear(Colors clr, String name){
        super(clr,name);
    }
    public Bear(Colors clr, String name, int age,String location) throws AgeException {
        super(clr,name,age);
        this.location=location;
    }

    public void talkTo(String talk,Animal ... args) {
        StringBuilder persons = new StringBuilder();
        for (Animal arg : args) {
            persons.append(arg.getName()+", ");
        }
        talk(persons+talk);
    }
}
