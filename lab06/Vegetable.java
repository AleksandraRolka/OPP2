
public class Vegetable extends Good {

    private int daysToExpire;

    public Vegetable(String name, String category, boolean expire, int purchasePrice, int salesPrice, int daysToExpire) {
        super(name, category, expire, purchasePrice, salesPrice);
        this.daysToExpire = daysToExpire;
    }

    public void expiring() {
        daysToExpire -= 1;
    }

    public boolean checkDate() {
        return daysToExpire > 0;
    }

}