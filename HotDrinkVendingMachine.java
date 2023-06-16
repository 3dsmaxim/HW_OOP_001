
import java.util.Iterator;
import java.util.LinkedList;

public class HotDrinkVendingMachine implements VendingMachine, Iterator<HotDrink> {
    private LinkedList<HotDrink> l = new LinkedList<>();
    private int count;

    public void adder(HotDrink item) {
        this.l.addFirst(item);

    }

    @Override
    public void getProdukt(String name, int volume, Double temperature) {
        for (var i : l) {
            if (i.getName() == name) {
                if (i.getVolume() == volume) {
                    if (i.getTemperature() == temperature) {
                        System.out.println(i);
                    }

                }
            }
        }

    }

    @Override
    public void getProdukt(String name, int volume) {
        for (var i : l) {
            if (i.getName() == name) {
                if (i.getVolume() == volume) {
                    System.out.println(i);
                }

            }
        }
    }

    @Override
    public void getProdukt(int volume, Double temperature) {
        for (var i : l) {
            if (i.getVolume() == volume) {
                if (i.getTemperature() == temperature) {
                    System.out.println(i);
                }

            }
        }
    }

    @Override
    public void getProdukt(String name) {
        for (var i : l) {
            if (i.getName() == name) {

                System.out.println(i);
            }
        }

    }

    @Override
    public void getProdukt(Double temperature) {
        for (var i : l) {

            if (i.getTemperature() == temperature) {
                System.out.println(i);
            }

        }

    }

    @Override
    public String toString() {

        return "Список {" + l + "}";
    }

    @Override
    public void getProdukt(int volume) {
        for (var i : l) {
            if (i.getVolume() == volume) {

                System.out.println(i);

            }
        }

    }

    @Override
    public void getProdukt(String name, Double temperature) {
        for (var i : l) {
            if (i.getName() == name) {

                if (i.getTemperature() == temperature) {
                    System.out.println(i);
                }

            }
        }

    }

    
    
    

    

    @Override
    public boolean hasNext() {

    return count < l.size();
    }

    @Override
    public HotDrink next() {
        if (!hasNext()) {
            System.out.println("-----0------");
        }
        return l.get(count++);
    }
    
    public LinkedList<HotDrink> getL() {
       
        return l;
    }

    

    
    


    


}
