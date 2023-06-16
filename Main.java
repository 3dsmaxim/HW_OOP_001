
import java.util.Collection;
import java.util.Iterator;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        HotDrinkVendingMachine listSet = new HotDrinkVendingMachine();

        listSet.adder(new HotDrink("Кофе", 500, 40.1, 120L));
        listSet.adder(new HotDrink("Чай", 300, 50.5, 55L));
        listSet.adder(new HotDrink("Кофе", 500, 30.4, 200L));
        listSet.adder(new HotDrink("Латте", 200, 50.5, 100L));
        listSet.adder(new HotDrink("Чай", 100, 40.5, 30L));

        // System.out.println(listSet);
        
        
        
        listSet.getProdukt("Кофе", 500);
        System.out.println("----------------");
        
        listSet.getProdukt("Кофе");
        System.out.println("----------------");
        
        listSet.getProdukt("Кофе", 300, 50.5);
        System.out.println("----------------");
        
        listSet.getProdukt(50.5);
        System.out.println("----------------");

        Iterator<HotDrink> chok = listSet;
        while (chok.hasNext()) {
            System.out.println(listSet.next());
        }
        System.out.println("----------------");
       
        List<HotDrink> list = listSet.getL().stream().sorted()
             .collect(Collectors.toList());
        System.out.println(list);

        
       

       

        
        

        

        

    }

}
