import java.util.Scanner;
//Print alternate prime numbers in a given range
public class AlternatePrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the starting number: ");
        int start = input.nextInt();
        System.out.println("Enter the ending number: ");
        int end = input.nextInt();
        int count = 0;
        int i = start;
        while (i <= end) {
            int flag = 0;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                count++;
                if (count % 2 == 0) {
                    System.out.println(i);
                }
            }
            i++;
        }
    }
}