//Print alternate odd numbers
import java.util.Scanner;
public class AlternateOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the starting number: ");
        int start = input.nextInt();
        System.out.println("Enter the ending number: ");
        int end = input.nextInt();
        int count = 0;
        int i = start;
        while (i <= end) {
            count++;
            if (count % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}