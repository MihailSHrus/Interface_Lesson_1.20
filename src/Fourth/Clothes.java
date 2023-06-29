package Fourth;

import javax.xml.crypto.dsig.SignedInfo;

public abstract class Clothes {
    public Clothes() {};
    public Clothes(String size, double price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
        this.esize = Sizes.valueOf(size);
    }
    private String size;
    private double price;
    private String color;
    private Sizes esize;
    public String getSize() {
        return size;
    }
    public double getPrice() {
        return price;
    }
    public String getColor() {
        return color;
    }
    public int getEsize() {
        return esize.getEuroSize();
    }
    public String getDescription() {
        return esize.getDescription();
    }


}
