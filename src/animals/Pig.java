package animals;

import java.util.ArrayList;
import java.util.Arrays;

public class Pig extends Animal{
    ArrayList<Feels> feels=new ArrayList<>(Arrays.asList(Feels.LOST, Feels.WORRIED));

    public Pig(Colors clr, String name, int age){
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
            if(i!= size-1){
            System.out.print(feels.get(i).getFeel()+", ");}
            else {
                System.out.println(feels.get(i).getFeel() + ".");
            }
        }
    }
}
