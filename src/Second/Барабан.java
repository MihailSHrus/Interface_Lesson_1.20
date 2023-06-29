package Second;

public class Барабан implements Инструменты {
    public Барабан(){};
    public Барабан(int размер){
        this.размер = размер;
    }
    public int размер;
    public void play() {
        System.out.println("Играет Барабан " + размер  + "-ого размера. ");
    }
}
