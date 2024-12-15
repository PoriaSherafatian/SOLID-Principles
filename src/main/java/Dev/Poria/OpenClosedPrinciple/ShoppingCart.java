package Dev.Poria.OpenClosedPrinciple;

public class ShoppingCart {
    private Discount discount;

    public ShoppingCart(Discount discount) {
        this.discount = discount;
    }

    public double calculatePrice(double price) {
        return discount.applyDiscount(price);
    }
}

