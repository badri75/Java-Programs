//Program to find positive or negative
import java.util.Scanner;
public class PositiveNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = input.nextInt();
        if (n > 0) {
            System.out.println(n + " is a positive number");
        } else {
            System.out.println(n + " is a negative number");
        }
    }
}