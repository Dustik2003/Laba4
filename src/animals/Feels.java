package animals;

public enum Feels {
        SAD("Грусть"),
        HAPPY("Счастье"),
        ANGRY("Злость"),
    LOST("Потерянность"),
    WORRIED("Обеспокоенность");


    private String feel;
    Feels(String feel){
        this.feel=feel;
    }

    public String getFeel() {
        return feel;
    }
}
