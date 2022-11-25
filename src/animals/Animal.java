package animals;


import java.util.Objects;

public abstract class Animal implements Talking, Growing {
    private Colors favclr;
    private String name;
    private int age=1;
    private Tail tail=new Tail(age);
    private FavThing favThing =new FavThing();


    public Animal(Colors favclr, String name, int age, int len, String thing){
    }
    public Animal(Colors clr){
        this.favclr=clr;
    }
    public Animal(Colors clr,int age){
        this.favclr=clr;
        this.age=age;

        this.tail.len=age;
    }
    public Animal(Colors clr, String name){
        this.favclr=clr;
        this.name=name;
    }
    public Animal(Colors clr, String name, int age)throws PositiveAgeException {
        this.favclr=clr;
        this.name=name;
        if(age<0)throw new PositiveAgeException("Age can't be less than zero");
        this.age = age;
        this.tail.len=age;
    }

    public Animal(Colors favclr, String name, int age, String thing) {
        this.favclr = favclr;
        this.name = name;
        this.age = age;
        this.tail.len=age;
        this.favThing.name = thing;
    }
    public Animal(Colors favclr, String name, String thing) {
        this.favclr = favclr;
        this.name = name;
        this.favThing.name = thing;
    }

    public Animal() {

    }

    public void setFavThing(String name) {
        this.favThing.name=name;
    }

    public void setAge(int age)throws PositiveAgeException {
        if(age<0)throw new PositiveAgeException("Age can't be less than zero");
        this.age = age;
        this.tail.len=age;
    }

    public  void talk(String talk){
        try {
            System.out.println(this.getName() +" : \" "+ talk+"\"");
        }catch (NullNameException ex){
            System.out.println(ex);
        }

    }


    @Override
    public void grow() {
        this.age+=1;
        this.tail.len++;
    }


    public String getFavclr() {
        return this.favclr.getClr();
    }

    public int getAge() {
        return age;
    }


    public String getName() {
        if(this.name==null){
            throw new NullNameException("Object wasn't named");
        }
        else return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && favclr == animal.favclr && name.equals(animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(favclr, name, age);
    }

    @Override
    public String toString() {
        return getClass() +
                " { favclr=" + favclr +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    class Tail{
        int len=age;

        public Tail(int age) {
            this.len=age;
        }
    }
    static class FavThing{
        String name;

    }

    public FavThing getFavThing() {
        return favThing;
    }

    public void changeFavThing(String thing) {
        this.favThing.name = thing;
    }
}
