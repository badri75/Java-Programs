import java.util.Scanner;
//Generate number of prime numbers
public class NthPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the nth number: ");
        int n = input.nextInt();
        int count = 0;
        int i = 2;
        while (count < n) {
            int flag = 0;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                count++;
            }
            i++;
        }
        System.out.println("The " + n + "th prime number is " + (i - 1));
    }
}