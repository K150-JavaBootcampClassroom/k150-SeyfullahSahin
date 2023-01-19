public enum FruitType {
    APPLE("Elma"),
    PEAR("Armut"),
    CHERRY("Kiraz");

    String type;

    FruitType(String type){
        this.type = type;
    }

    public String getValue(){
        return type;
    }
}
