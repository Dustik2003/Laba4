package animals;

import java.util.ArrayList;

public class Pig extends Animal{
    ArrayList<Feels> feels=new ArrayList<>();
    public Pig(Colors clr, String name, int age){
        super(clr,name,age);
    }

    public ArrayList<Feels> getFeels() {
        return feels;
    }

    public void feel(Feels[] feel) {
        System.out.print("***Объект "+this.getClass()+" с именем "+this.getName()+" имеет чувства ");
        for (int i = 0; feel.length > i; i++) {
            this.feels.add(feel[i]);
            if(i!= feel.length-1){
            System.out.print(feels.get(i).getFeel()+", ");}
            else {
                System.out.println(feels.get(i).getFeel() + ".");
            }
        }
    }
}
