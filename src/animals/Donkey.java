package animals;

import java.util.ArrayList;

public class Donkey extends Animal{

    ArrayList<String> gifts=new ArrayList();
    public Donkey(Colors clr){
        super(clr);

    }    public Donkey(Colors clr, String name,int age) throws PositiveAgeException {
        super(clr,name,age);
    }
    public Donkey(Colors clr,int age){
        super(clr, age);
    }
    public Donkey(Colors clr, String name){
        super(clr,name);
    }
    public Donkey(){
    }

    public void receivingGift(String gift){
        try {
            System.out.println("Объект класса "+ this.getClass()+" с именем "+ getName()+" получил подарок "+gift);
        }catch (NullNameException ex){
            System.out.println(ex);
        }
        this.gifts.add(gift);
    }

    public void printGifts(){
        try {
            System.out.println("Подарки "+this.getName()+" :");
        }catch (NullNameException ex){
            System.out.println(ex);
        }
        for (int i=0;i<this.gifts.size();i++){
            System.out.println(this.gifts.get(i));
        }}


}
