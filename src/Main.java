import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        MaterialManager materialManager = new MaterialManager();
        materialManager.materials[0] = new Meat(1, "chicken", LocalDate.now().plusDays(6), 10000, 20);
        materialManager.materials[1] = new Meat(2, "beef", LocalDate.now().plusDays(5), 15000, 30);
        materialManager.materials[2] = new Meat(3, "sheep", LocalDate.now().plusDays(4), 20000, 40);
        materialManager.materials[3] = new Meat(4, "fish", LocalDate.now().plusDays(3), 25000, 60);
        materialManager.materials[4] = new Meat(5, "squid", LocalDate.now().plusDays(1), 30000, 10);

        materialManager.materials[5] = new CrispyFlour(6, "ajingon", LocalDate.now().plusMonths(2), 35000, 2);
        materialManager.materials[6] = new CrispyFlour(7, "namngu", LocalDate.now().plusMonths(3), 40000, 4);
        materialManager.materials[7] = new CrispyFlour(8, "haohao", LocalDate.now().plusMonths(4), 45000, 6);
        materialManager.materials[8] = new CrispyFlour(9, "chinsu", LocalDate.now().plusMonths(5), 50000, 8);
        materialManager.materials[9] = new CrispyFlour(10, "trungbe", LocalDate.now().plusMonths(6), 55000, 10);


        for (int i = 0; i < materialManager.materials.length; i++) {
            System.out.println(materialManager.materials[i] + " No Discount  : " + materialManager.materials[i].getAmount());
            System.out.println(materialManager.materials[i] + " Discount : " + materialManager.materials[i].getRealMoney());
        }

    }
}
