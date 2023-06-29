package First;

public class Book implements  Printable {
    public Book() {};
    public Book(String title) {
        this.title = title;
    }
    public String title;
    public void print(){
        System.out.println(title);
    }
    public static void printBooks(Printable[] printable) {
        for (Printable a: printable) {
            if (a instanceof Book) {
                a.print();
            }
        }
    }
}
