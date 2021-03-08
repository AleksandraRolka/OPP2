
public class Good implements GoodExpInterface{

    protected String name;
    protected String category;
    protected int purchasePrice;
    protected int salesPrice;
    protected boolean expire;

    public Good(String name, String category, boolean expire, int purchasePrice, int salesPrice) {
        this.name = name;
        this.category = category;
        this.purchasePrice = purchasePrice;
        this.salesPrice = salesPrice;
        this.expire = expire;
    }

    public String getName() {
        return name;
    }

    public int getSalesPrice() {
        return salesPrice;
    }

    public int getPurchasePrice() {
        return purchasePrice;
    }

    public String toString() {
        return name + " \t" + category + " \t" + purchasePrice + " \t" + salesPrice;
    }

    public boolean getExpire() {
        return expire;
    }

    public void expiring() {};

    public boolean checkDate() { return true; };


}