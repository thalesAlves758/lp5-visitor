public class Headset extends Product {
    public Headset(String name, double price) {
        super(name, price);
    }

    @Override
    public double accept(Visitor visitor) {
        return visitor.calculateHeadsetDiscount(this);
    }
}
