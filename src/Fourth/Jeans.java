package Fourth;

public class Jeans extends Clothes implements MenClothes, WomenClothes{
    public Jeans(String size, double price, String color) {
        super(size, price, color);
    }
    public String MenWear() {
        return "Мужские штаны";
    };
    public String WomenWear() {
        return "Женские штаны";
    };
}
