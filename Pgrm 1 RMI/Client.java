//Client program in rmi
import java.rmi.Naming;
import java.util.Scanner;

public class Client {
    public static void main(String args[]) {
        try {
            Interf ar = (Interf) Naming.lookup("rmi://localhost:1099/Interf");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter two numbers");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = ar.add(a, b);
            System.out.println("Addition of " + a + " and " + b + " is " + c);
            c = ar.sub(a, b);
            System.out.println("Subtraction of " + a + " and " + b + " is " + c);
            c = ar.mul(a, b);
            System.out.println("Multiplication of " + a + " and " + b + " is " + c);
            c = ar.div(a, b);
            System.out.println("Division of " + a + " and " + b + " is " + c);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}