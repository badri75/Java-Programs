//Reverse a Number
//Given a number, reverse the digits and return the resulting number.
import java.util.Scanner;
public class ReverseNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = input.nextInt();
        int temp = n;
        int rev = 0;
        while (n > 0) {
            int d = n % 10;
            rev = rev * 10 + d;
            n = n / 10;
        }
        System.out.println("Reverse of " + temp + " is " + rev);
    }
}