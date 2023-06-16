public class HotDrink extends Drink implements Comparable<HotDrink> {

    private double temperature;
    private int volume;
    public long pryce;

    public HotDrink(String name, int volume, Double temperature, Long pryce) {
        super(name);
        this.volume = volume;
        this.temperature = temperature;
        this.pryce = pryce;
    }

    public long getPryce() {
        return pryce;
    }

    public void setPryce(Long pryce) {
        this.pryce = pryce;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {

        return "Наименование: " + super.name + " " + volume + " ml. " + "  Температура " + temperature
                + "  Цена " + pryce;
    }

    @Override
    public boolean equals(Object obj) {
        HotDrink temp = (HotDrink) obj;

        return this.pryce == temp.pryce
                && this.temperature == temp.temperature
                && this.volume == temp.volume;
    }

    public int compareTo(HotDrink o) {
        if (this.pryce > o.pryce)
            return 1;
        else if (this.pryce < o.pryce)
            return -1;
        else
            return 0;
    }
    // public int compareTo(HotDrink o) {
    //      return Integer.compare(this.pryce, o.pryce);
    // }

   

}
