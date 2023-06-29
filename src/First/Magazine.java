package First;

public class Magazine implements Printable {
    public Magazine() {};
    public Magazine(String title) {
        this.title = title;
    }
    public String title;
    public void print() {
        System.out.println(title);
    }
    public static void printMagazines (Printable[] printable) {
        for (Printable a: printable) {
            if (a instanceof Magazine) {
                a.print();
            }
        }
    }
}
