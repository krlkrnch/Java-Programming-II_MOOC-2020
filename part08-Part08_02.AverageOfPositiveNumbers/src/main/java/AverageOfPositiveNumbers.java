
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        int sum = 0;
        System.out.println("Give numbers:");
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0 && count == 0) {
                System.out.println("Cannot calculate the average");
                break;
            }

            if (number > 0) {
                count++;
                sum += number;
            }
            if (number == 0) {
                break;
            }
        }

        System.out.println("Average of positive numbers: " + 1.0 * sum / count);

    }
}
