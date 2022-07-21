//sum of natural numbers
import java.util.Scanner;
public class SumNatural{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = input.nextInt();
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum = sum + i;
        }
        System.out.println("Sum of natural numbers from 1 to " + n + " is " + sum);
    }
}