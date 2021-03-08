import java.util.List;
import java.util.ArrayList;

public class Store {

    int balance;
    int date;
    List<Good> goodsList;

    public Store() {
        balance = 0;
        date = 0;
        goodsList = new ArrayList<Good>();
    }

    public void nextDay() {
        this.date += 1;

        for (int i = 0; i < goodsList.size(); i++) {
            if (goodsList.get(i).getExpire()) ;
            {
                goodsList.get(i).expiring();
            }
        }
    }

    public int getBalance() {
        return this.balance;
    }

    public void addFruit(String name, String category, boolean expire, int purchasePrice, int salesPrice, int daysToExpire) {
        Fruit obj = new Fruit(name, category, expire, purchasePrice, salesPrice, daysToExpire);
        goodsList.add(obj);
    }

    public void addVegetable(String name, String category, boolean expire, int purchasePrice, int salesPrice, int daysToExpire) {
        Vegetable obj = new Vegetable(name, category, expire, purchasePrice, salesPrice, daysToExpire);
        goodsList.add(obj);
    }

    public void addAgd(String name, String category, boolean expire, int purchasePrice, int salesPrice) {
        Agd obj = new Agd(name, category, expire, purchasePrice, salesPrice);
        goodsList.add(obj);
    }

    public void printGoodsList() {
        System.out.println("Lista towarów: (nazwa, kategoria, cena zakupu, cena sprzedazy)");

        for (int i = 0; i < goodsList.size(); i++) {
            System.out.println(i + 1 + ") " + goodsList.get(i));
        }
    }

    public void checkExpiration() {
        for (int i = 0; i < goodsList.size(); i++) {
            if (goodsList.get(i).getExpire()) ;
            {
                if (!goodsList.get(i).checkDate()) {
                    balance -= goodsList.get(i).getPurchasePrice();
                    goodsList.remove(i);
                }
            }
        }

    }

    public int size() {
        return goodsList.size();
    }

    public void sell(int i) {
        balance -= goodsList.get(i).getPurchasePrice();
        balance += goodsList.get(i).getSalesPrice();
        goodsList.remove(i);
    }

}