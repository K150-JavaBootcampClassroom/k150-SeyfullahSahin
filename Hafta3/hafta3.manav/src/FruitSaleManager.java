public class FruitSaleManager implements IFruitSaleStrategy{

    IFruitSaleStrategy iFruitSaleStrategy;
    @Override
    public void fruitSales(Fruit fruit) {
        iFruitSaleStrategy.fruitSales(fruit);
    }

    @Override
    public void add(Fruit fruit, double kg) {
        fruit.setUnitStock(fruit.getUnitStock()+ kg);
        System.out.println("Stokta " + fruit.getFruitType().getValue() + " güncellendi: " + fruit.getUnitStock());

    }

    @Override
    public void buy(Fruit fruit, double kg) {
        if(kg> fruit.getUnitStock()){
            System.out.println( "Stoktaki miktar yetersiz!!!");
        }
        else{
            fruit.setUnitStock(fruit.getUnitStock() - kg);
            System.out.println("Ürün satın alındı.");
            System.out.println("Stok adedi: " + fruit.getUnitStock());
        }
    }


}
