import java.util.LinkedList;

public class HotDrinkVendingMachine implements VendingMachine {
    private LinkedList<HotDrink> l = new LinkedList<>();

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

}
