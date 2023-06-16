public interface VendingMachine {

    public void getProdukt(String name, int volume, Double temperature);

    public void getProdukt(String name, int volume);

    public void getProdukt(String name, Double temperature);

    public void getProdukt(int volume, Double temperature);

    public void getProdukt(String name);

    public void getProdukt(Double temperature);

    public void getProdukt(int volume);

    
}
