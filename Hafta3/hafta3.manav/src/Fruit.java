public class Fruit {
    private double unitStock;
    private FruitType fruitType;

    public Fruit(double unitStock, FruitType fruitType) {
        this.unitStock = unitStock;
        this.fruitType = fruitType;
    }

    public double getUnitStock() {
        return unitStock;
    }

    public void setUnitStock(double unitStock) {
        this.unitStock = unitStock;
    }

    public FruitType getFruitType() {
        return fruitType;
    }

    public void setFruitType(FruitType fruitType) {
        this.fruitType = fruitType;
    }
}
