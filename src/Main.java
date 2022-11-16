import animals.*;

public class Main {
    public static void main(String[] args) throws PositiveAgeException {
        Donkey ia;
        Bear puh;
        Pig pyatachok;
        try {
            ia= new Donkey(Colors.RED,10);
            puh= new Bear(Colors.BLUE,"ПУХ",10,"Другой берег");
            pyatachok= new Pig(Colors.GREEN,"Пятачок",10);
            puh.setAge(-9);
        }catch (PositiveAgeException ex){
            ia= new Donkey(Colors.RED);
            puh= new Bear(Colors.BLUE,"ПУХ","Другой берег");
            pyatachok= new Pig(Colors.GREEN,"Пятачок");
            System.out.println(ex);
        }
        try {
            System.out.println("Сегодня день рождения " + ia.getName());
        }catch (NullNameException ex){
            System.out.println(ex);
        }

        try {
            System.out.println(ia.getName()+ia.getAge()+" лет");
        }catch (NullNameException ex){
            System.out.println(ex);
        }
        System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
        ia.grow();
        try {
            System.out.println(ia.getName()+ia.getAge()+" лет");
        }catch (NullNameException ex){
            System.out.println(ex);
        }
        ia.receivingGift("Шарик");
        ia.receivingGift("Гвоздь");
        ia.receivingGift("Хвост");
        ia.printGifts();
        ia.talk("Подумать только! "+ia.getFavclr()+"... Мой любимый цвет");
        pyatachok.feel(pyatachok.getFeels());
        pyatachok.talk("(ಠ_ಠ) (ಠ_ಠ) (ಠ_ಠ) ");
        System.out.println("***Объект класса "+ puh.getClass()+" с именем "+puh.getName()+" расположен по месту "+puh.getLocation()+"***");
        puh.talkTo("ЭЭЭЭЭЙЙ, я на другом берегу, какие у вас хеш-кооооды?", pyatachok, ia);
        pyatachok.talk("У меня "+pyatachok.hashCode());
        ia.talk("У меня "+ia.hashCode());
        puh.talk("А у меня "+puh.hashCode());
        System.out.println("\n\n");
        System.out.println(puh);
        System.out.println(pyatachok);
        System.out.println(ia);
    }
}