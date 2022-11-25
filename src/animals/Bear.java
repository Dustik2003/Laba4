package animals;

public class Bear extends Animal{
    private String location;


    public Bear(Colors clr, String name,String location){
        super(clr,name);
        this.location=location;
    }
    public Bear(Colors clr, String name, int age,String location) throws PositiveAgeException {
        super(clr,name,age);
        this.location=location;
    }
    public Bear(Colors clr, String name, int age,String thing,String location) throws PositiveAgeException {
        super(clr,name,age, thing);
        this.location=location;
    }

    public Bear() {
        super();
    }

    public String getLocation() {
        return location;
    }
    public void talkTo(String talk,Animal ... args) {
        StringBuilder persons = new StringBuilder();
        for (Animal arg : args) {
            try {
                persons.append(arg.getName()+", ");
            }catch (NullNameException ex){
                System.out.println(ex);
            }
        }
        talk(persons+talk);
    }
}
