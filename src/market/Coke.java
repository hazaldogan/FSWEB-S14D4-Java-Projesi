package market;

import market.enums.ProductType;

public class Coke extends ProductForSale{
    private String cokeType;

    public Coke(ProductType type, double price, String description, String cokeType) {
        super(type, price, description);
        this.cokeType = cokeType;
    }

    @Override
    public void showDetails() {
        System.out.println(super.toString() + this);
    }

    @Override
    public String toString() {
        return "Coke{" +
                "cokeType='" + cokeType + '\'' +
                '}';
    }
}
