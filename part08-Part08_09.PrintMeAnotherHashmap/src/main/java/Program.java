
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        HashMap<String, Book> hashmap = new HashMap<>();
        hashmap.put("1984", new Book("1984", 1949, "..."));
        hashmap.put("1985", new Book("1985", 1949, "..."));
        printValues(hashmap);
        System.out.println("");
        printValueIfNameContains(hashmap, "4");

    }

    public static void printValues(HashMap<String, Book> hashmap) {
        for (Book book : hashmap.values()) {
            System.out.println(book);
        }

    }

    public static void printValueIfNameContains(HashMap<String, Book> hashmap, String text) {
        for (Book book : hashmap.values()) {
            if (book.getName().contains(text)) {
                System.out.println(book);
            }

        }
    }

}
