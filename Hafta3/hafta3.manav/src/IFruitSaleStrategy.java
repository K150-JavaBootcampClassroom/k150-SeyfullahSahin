public interface IFruitSaleStrategy {
    void fruitSales(Fruit fruit);

    void add(Fruit fruit, double kg);
    void buy(Fruit fruit, double kg);
}
