import java.util.Scanner;

public class lab06 {
    public static void main(String[] argv) {
        Store myStore = new Store();
        Scanner scan = new Scanner(System.in);
        System.out.println("\n__________________ TWOJ SKLEP __________________");
        System.out.println("\nZarządzaj sklepem wybierajac odpowiednie opcje:");
        System.out.println("--------------------------------------------------");

        String menu1 = "\n1) Dodaj towar\n" +
                "2) Sprzedaj towar\n" +
                "3) Kolejny dzień\n" +
                "4) Bilans\n" +
                "X) Koniec programu\n";

        String menu2 = "\n1) dodaj owoc\n" +
                "2) dodaj warzywo\n" +
                "3) dodaj drobne agd\n";

        String menu3_1 = "\npodaj nazwę:";
        String menu3_2 = "podaj cenę zakupu: (cena zakupu na hurtowni)";
        String menu3_3 = "podaj cenę sprzedaży:";

        String ch1, ch2;
        int ch2i;
        String name;
        int purchasePrice, salesPrice;
        String category[] = {"owoc", "warzywo", "agd"};
        int daysToExpire[] = {1, 2};


        while (true) {
            // wyświeltenie glownego menu i wybor opcji
            System.out.println(menu1);
            ch1 = scan.nextLine();

            if (ch1.equals("1")) {
                System.out.println(menu2);
                ch2 = scan.nextLine();
                ch2i = Integer.parseInt(ch2);
                System.out.println(menu3_1);
                name = scan.nextLine();
                System.out.println(menu3_2);
                purchasePrice = Integer.parseInt(scan.nextLine());
                System.out.println(menu3_3);
                salesPrice = Integer.parseInt(scan.nextLine());
                if (ch2i == 1) {
                    myStore.addFruit(name, category[0], true, purchasePrice, salesPrice, daysToExpire[0]);
                } else if (ch2i == 2) {
                    myStore.addVegetable(name, category[1], true, purchasePrice, salesPrice, daysToExpire[1]);
                } else if (ch2i == 3) {
                    myStore.addAgd(name, category[2], false, purchasePrice, salesPrice);
                }
            } else if (ch1.equals("2")) {
                myStore.printGoodsList();
                if (myStore.size() == 0) {
                    System.out.println("Magazyn jest pusty");
                } else {
                    System.out.println("Wybierz nr towaru, ktory chcesz sprzedac:");
                    ch2 = scan.nextLine();
                    ch2i = Integer.parseInt(ch2) - 1;
                    if (ch2i >= myStore.size()) {
                        System.out.println("Niepoprawny indeks towaru");
                    } else {
                        myStore.sell(ch2i);
                        System.out.println("Sprzedane");
                    }
                }
            } else if (ch1.equals("3")) {
                myStore.nextDay();
                myStore.checkExpiration();
            } else if (ch1.equals("4")) {
                System.out.println("Bilans = " + myStore.getBalance());
            } else if (ch1.equals("X") || ch1.equals("x")) {
                System.out.println("ZAMYKAMY SKLEP");
                break;
            }

            System.out.print("\n--------------------");

        }
    }
}
