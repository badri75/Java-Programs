//Armstrong number
import java.util.Scanner;
public class Armstrong{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = input.nextInt();
        int temp = n;
        int sum = 0;
        int rem;
        while(n>0){
            rem = n%10;
            sum = sum + (rem*rem*rem);
            n = n/10;
        }
        if(temp == sum){
            System.out.println(temp + " is an Armstrong number");
        }
        else{
            System.out.println(temp + " is not an Armstrong number");
        }
    }
}