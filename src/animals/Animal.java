package animals;


import java.util.Objects;

public abstract class Animal implements Talking, Growing {
    private Colors favclr;
    private String name;
    private int age;


    public void setAge(int age)throws PositiveAgeException {
        if(age<0)throw new PositiveAgeException("Age can't be less than zero");
        this.age = age;
    }

    public  void talk(String talk){
        System.out.println(this.getName() +" : \" "+ talk+"\"");
    }

    @Override
    public void grow() {
        this.age+=1;
    }


    public String getFavclr() {
        return this.favclr.getClr();
    }

    public int getAge() {
        return age;
    }


    public String getName() {
        return name;
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

    public Animal(){

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
    }
}
