package Fourth;

public class Tie extends Clothes implements MenClothes {
    public Tie(String size, double price, String color) {
        super(size, price, color);
    }
    public String MenWear() {
        return "Мужской галстук";
    };
}
