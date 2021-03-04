
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        IOU mattsiou = new IOU();
        mattsiou.setSum("Karel", 5.4);
        mattsiou.setSum("Charlie", 30);
        System.out.println(mattsiou.howMuchDoIOweTo("Karel"));
        System.out.println(mattsiou.howMuchDoIOweTo("Charlie"));

    }
}
