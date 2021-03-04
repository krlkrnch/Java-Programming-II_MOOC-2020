
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        System.out.println("Give numbers:");
        while (true) {
            String numbers = scanner.nextLine();
            if (numbers.equals("end")) {
                break;
            } else {
                number = Integer.valueOf(numbers);
                System.out.println(number * number * number);
            }

        }

    }
}
