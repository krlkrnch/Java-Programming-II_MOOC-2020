
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        SimpleDate d = new SimpleDate(13, 12, 1995);

        HashMap<SimpleDate, Integer> hashmap = new HashMap<>();

        hashmap.put(d, 2);
        System.out.println(hashmap.get(d));
        System.out.println(hashmap.get(new SimpleDate(13, 12, 1995)));

    }
}
