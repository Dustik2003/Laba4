package animals;

import java.util.ArrayList;

public class Donkey extends Animal{

    ArrayList<String> gifts=new ArrayList();

    public void receivinggift(String gift){
        System.out.println("Объект класса "+ this.getClass()+" с именем "+ getName()+" получил подарок "+gift);
        this.gifts.add(gift);
    }

    public void printgifts(){
        System.out.println("Подарки "+this.getName()+" :");
        for (int i=0;i<=this.gifts.size();i++){
            if(i>=this.gifts.size()) throw new PrizesCounterException("Count of gifts less than value of iterator");
            else System.out.println(this.gifts.get(i));
        }}

    public Donkey(Colors clr, String name,int age) throws PositiveAgeException {
        super(clr,name,age);
    }
    public Donkey(Colors clr, String name){
        super(clr,name);
    }
    public Donkey(){
    }
}
