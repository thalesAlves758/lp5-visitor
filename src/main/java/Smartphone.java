public class Smartphone extends Product {
    public Smartphone(String name, double price) {
        super(name, price);
    }

    @Override
    public double accept(Visitor visitor) {
        return visitor.calculateSmartphoneDiscount(this);
    }
}
