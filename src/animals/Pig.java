package animals;

import java.util.ArrayList;
import java.util.Arrays;

public class Pig extends Animal{
    ArrayList<Feels> feels=new ArrayList<>(Arrays.asList(Feels.LOST, Feels.WORRIED));

    public Pig(){}
    public Pig(Colors clr, String name){
        super(clr,name);
    }
    public Pig(Colors clr, String name, int age) throws AgeException {
        super(clr,name,age);
    }

    public ArrayList<Feels> getFeels() {
        return feels;
    }

    public void feel(ArrayList<Feels> feel) {
        System.out.print("***Объект "+this.getClass()+" с именем "+this.getName()+" имеет чувства ");
        int size= feel.size();
        for (int i = 0; i<size; i++) {
            this.feels.add(feel.get(i));
            System.out.print(i!= size-1?feels.get(i).getFeel()+", ":feels.get(i).getFeel() + ".");
        }
    }
}
