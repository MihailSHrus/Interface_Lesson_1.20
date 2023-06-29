package Second;

public class Гитара implements Инструменты {
    public Гитара(){};
    public Гитара(int количествоСтрун){
        this.количествоСтрун = количествоСтрун;
    }
    public int количествоСтрун;
    public void play() {
        System.out.println("Играет Гитара c " + количествоСтрун + " струнами. " + KEY);
    };
}
