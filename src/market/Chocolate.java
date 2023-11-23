package market;

import market.enums.ProductType;

public class Chocolate extends ProductForSale {
    private String chocoType;

    public Chocolate(ProductType type, double price, String description, String chocoType) {
        super(type, price, description);
        this.chocoType = chocoType;
    }

    @Override
    public void showDetails() {
        System.out.println(super.toString() + this);
    }

    @Override
    public String toString() {
        return "Chocolate{" +
                "chocoType='" + chocoType + '\'' +
                '}';
    }
}


