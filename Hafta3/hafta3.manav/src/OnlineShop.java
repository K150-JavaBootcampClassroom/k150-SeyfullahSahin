public class OnlineShop {
    public static void main(String[] args) {

        Fruit fruit = new Fruit(20,FruitType.APPLE);
        Fruit fruit1 = new Fruit(30, FruitType.PEAR);
        Fruit fruit2 = new Fruit(40, FruitType.CHERRY);

        FruitSaleManager fruitSaleManager = new FruitSaleManager();

        fruitSaleManager.add(fruit, 5);
        fruitSaleManager.buy(fruit, 30);

        fruitSaleManager.add(fruit1, 4.5);
        fruitSaleManager.buy(fruit1, 9.8);

        fruitSaleManager.add(fruit2, 2);
        fruitSaleManager.buy(fruit2, 45);

    }


}
