import First.Book;
import First.Magazine;
import First.Printable;
import Fourth.*;
import Second.Барабан;
import Second.Гитара;
import Second.Инструменты;
import Second.Труба;
import Third.YearSeasons;

public class Main {
    public static void main(String[] args) {
        // Задание 1
        Printable[] toPrint = new Printable[] {
                new Book("Война и Мир"),
                new Magazine("Игромания"),
                new Book("50 оттенков серого"),
                new Magazine("Forbes")
        };
        System.out.println("-Задание 1-");
        System.out.println("-Все объекты-");
        for (Printable a : toPrint) {
            a.print();
        }
        System.out.println("-Только Книги-");
        Book.printBooks(toPrint);
        System.out.println("-Только Журналы-");
        Magazine.printMagazines(toPrint);
        // Задание 2
        System.out.println("-Задание 2-");
        Инструменты[] группа = new Инструменты[] {
                new Гитара(6),
                new Барабан(2),
                new Гитара(6),
                new Труба(4),
                new Труба(3),
                new Барабан(3),
                new Гитара(8),
                new Барабан(4)
        };
        for (Инструменты a : группа) {
            a.play();
        }
        // Задание 3
        System.out.println("-Задание 3-");
        YearSeasons summ = YearSeasons.SUMMER;
        summ.printFav();
        System.out.println("-Использование enum-");
        YearSeasons my = YearSeasons.SPRING;
        my.seasonMatch(my);
        System.out.println(my.getDescription());
        for (YearSeasons allSeasons : YearSeasons.values()) {
            System.out.println(allSeasons + " " + allSeasons.getTemp() + " " + allSeasons.getDescription());
        }
        // Задание 4
        System.out.println("-Задание 4-");
        Clothes[] stand = new Clothes[] {
                new Shirt("XS", 190.2, "Красный"),
                new Jeans( "S", 425.99, "Чёрный"),
                new Shirt("L", 260.5, "Синий"),
                new Tie("S", 170.2, "Чёрный"),
                new Skirt("XXS", 276.8, "Розовый"),
                new Jeans("M", 499.99, "Синий"),
                new Shirt( "M", 199.99, "Чёрный"),
                new Shirt("S", 190.1, "Чёрный"),
                new Jeans("XXS", 380.5, "Белый"),
                new Tie("L", 333.33, "Радужный")
        };
        Atelier test = new Atelier();
        System.out.println("-Одежда на мужчин-");
        test.MenWear(stand);
        System.out.println("-Одежда на девушек-");
        test.WomenWear(stand);
    }
}