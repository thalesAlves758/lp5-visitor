public class Computer extends Product {
    public Computer(String name, double price) {
        super(name, price);
    }

    @Override
    public double accept(Visitor visitor) {
        return visitor.calculateComputerDiscount(this);
    }
}
