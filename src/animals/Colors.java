package animals;

public enum Colors {
    RED("Красный"),
    BLUE("Синий"),
    GREEN("Зелёный"),
    BLACK("Чёрный"),
    WHITE("Белый"),
    BROWN("Коричневый");

    private String clr;
    Colors(String clrname){
        this.clr=clrname;
    }

    public String getClr() {
        return clr;
    }
}
