package Fourth;

public class Shirt extends Clothes implements MenClothes, WomenClothes {
    public Shirt(String size, double price, String color) {
        super(size, price, color);
    }
    public String MenWear() {
        return "Мужская футблока";
    };
    public String WomenWear() {
        return "Женская футболка";
    };
}
