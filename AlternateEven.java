//Print alternate even numbers
import java.util.Scanner;
public class AlternateEven {
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
            if (count % 2 == 1) {
                System.out.println(i);
            }
            i++;
        }
    }
}