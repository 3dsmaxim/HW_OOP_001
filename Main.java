public class Main {
    public static void main(String[] args) {
        HotDrinkVendingMachine listSet = new HotDrinkVendingMachine();
        HotDrink hd = new HotDrink("Кофе", 500, 40.1);
        listSet.adder(hd);
        hd = new HotDrink("Кофе", 300, 50.5);
        listSet.adder(hd);
        hd = new HotDrink("Кофе", 500, 30.4);
        listSet.adder(hd);
        hd = new HotDrink("Латте", 200, 50.5);
        listSet.adder(hd);

        System.out.println(listSet);
        System.out.println("----------------");

        listSet.getProdukt("Кофе", 500);
        System.out.println("----------------");

        listSet.getProdukt("Кофе");
        System.out.println("----------------");

        listSet.getProdukt("Кофе", 300, 50.5);
        System.out.println("----------------");

        listSet.getProdukt(50.5);

    }

}
