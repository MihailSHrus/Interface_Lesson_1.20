package Fourth;

public class Skirt extends Clothes implements WomenClothes {
    public Skirt(String size, double price, String color) {
        super(size, price, color);
    }
    public String WomenWear() {
        return "Женская юбка";
    };
}
