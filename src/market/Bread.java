package market;

import market.enums.ProductType;

public class Bread extends ProductForSale{
    private String breadType;

    public Bread(ProductType type, double price, String description, String breadType) {
        super(type, price, description);
        this.breadType = breadType;
    }

    @Override
    public void showDetails() {
        System.out.println(super.toString() + this);
    }

    @Override
    public String toString() {
        return "Bread{" +
                "breadType='" + breadType + '\'' +
                '}';
    }
}
