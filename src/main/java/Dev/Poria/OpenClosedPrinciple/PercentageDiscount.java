package Dev.Poria.OpenClosedPrinciple;

public class PercentageDiscount extends Discount {
    private double percentage;

    public PercentageDiscount(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public double applyDiscount(double price) {
        return price - (price * (percentage / 100));
    }
}

