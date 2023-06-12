public class HotDrink extends Drink {

    private double temperature;// первое
    private int volume;

    public HotDrink(String name, int volume, Double temperature) {
        super(name);
        this.volume = volume;
        this.temperature = temperature;
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

        return "Наименование: " + super.name + " " + volume + " ml. " + "  Температура " + temperature;
    }

}
