import java.time.LocalDate;

public class CrispyFlour extends Material implements Discount {
    private double quantify;

    public CrispyFlour(int id, String name, LocalDate manufacturingDate, int cost, double quantify) {
        super(id, name, manufacturingDate, cost);
        this.quantify = quantify;
    }

    public double getQuantify() {
        return quantify;
    }

    public void setQuantify(double quantify) {
        this.quantify = quantify;
    }

    @Override
    double getAmount() {
        return this.getCost() * this.getQuantify();
    }

    @Override
    LocalDate getExpiryDate() {
        return this.getManufacturingDate().plusYears(1);
    }


    @Override
    public double getRealMoney() {
        if (getExpiryDate().isAfter(LocalDate.now().plusMonths(4))) {
            return this.getAmount() - (this.getAmount() * 0.2);
        }
        if (getExpiryDate().isAfter(LocalDate.now().plusMonths(2))) {
            return this.getAmount() - (this.getAmount() * 0.4);
        } else return this.getAmount() - (this.getAmount() * 0.05);
    }


    @Override
    public String toString() {
        return "CrispyFlour{" + super.toString() +
                "quantify=" + quantify +
                '}';
    }
}
