package Second;

public class Труба implements Инструменты {
    public Труба(){};
    public Труба(int диаметр){
        this.диаметр = диаметр;
    }
    public int диаметр;
    public void play() {
        System.out.println("Играет Труба " + диаметр + "-ого диаметра. " + KEY);
    }
}
