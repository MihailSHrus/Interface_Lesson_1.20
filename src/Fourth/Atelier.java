package Fourth;

import First.Book;

public class Atelier {
    public void  MenWear(Clothes... stand) {
        for (Clothes a: stand) {
            if (a instanceof MenClothes) {
                System.out.println(
                        ((MenClothes) a).MenWear() +
                                ", Размер - " + a.getSize() +
                                "(" + a.getEsize() + ")" +
                                " - " + a.getDescription() +
                                ", Цвет - " + a.getColor() +
                                ", Цена - " + a.getPrice());
            }
        }
    };
    public void  WomenWear(Clothes... stand) {
        for (Clothes a: stand) {
            if (a instanceof WomenClothes) {
                System.out.println(
                        ((WomenClothes) a).WomenWear() +
                                ", Размер - " + a.getSize() +
                                "(" + a.getEsize() + ")" +
                                " - " + a.getDescription() +
                                ", Цвет - " + a.getColor() +
                                ", Цена - " + a.getPrice());
            }
        }

    };
}
