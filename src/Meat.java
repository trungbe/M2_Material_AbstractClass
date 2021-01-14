import java.time.LocalDate;

public class Meat extends Material implements Discount {
    private double weight;

    public Meat() {
    }

    public Meat(int id, String name, LocalDate manufacturingDate, int cost, double weight) {
        super(id, name, manufacturingDate, cost);
        this.weight = weight;
    }

    @Override
    double getAmount() {
        return this.getCost() * this.weight;
    }

    @Override
    LocalDate getExpiryDate() {
        return this.getManufacturingDate().plusDays(7);
    }

    @Override
    public double getRealMoney() {
        if (getExpiryDate().isAfter(LocalDate.now().plusDays(5))) {
            return this.getAmount() - (this.getAmount() * 0.3);
        }
        if (getExpiryDate().isAfter(LocalDate.now().plusDays(3))) {
            return this.getAmount() - (this.getAmount() * 0.5);
        } else return this.getAmount() - (this.getAmount() * 0.1);
    }


    @Override
    public String toString() {
        return "Meat{" + super.toString() +
                "weight=" + weight +
                '}';
    }
}
