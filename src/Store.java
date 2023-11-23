import market.Bread;
import market.Chocolate;
import market.Coke;
import market.ProductForSale;
import market.enums.ProductType;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] sales = new ProductForSale[3];
        sales[0] = new Chocolate(ProductType.CHOCOLATE,
                3.70,"delicious", "bitter");
        sales[1] = new Coke(ProductType.COKE,15.50,
                "unhealthy","Zero");
        sales[2] = new Bread(ProductType.BREAD,0.50,"to be bread, lol"
                ,"wholemeal");

        listProducts(sales);
    }

    public static void listProducts(ProductForSale[] products) {

    }
}