public class DiscountCalculator implements Visitor {
    private double discountRate;

    public DiscountCalculator(double discountRate) {
        this.discountRate = discountRate;
    }

    public double calculateSmartphoneDiscount(Smartphone smartphone) {
        return smartphone.getPrice() * (discountRate/100.0);
    }

    public double calculateComputerDiscount(Computer computer) {
        return computer.getPrice() * (discountRate/100.0) + 100.0;
    }
}
