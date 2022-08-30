import java.util.Scanner;
public class Prgm9b
{
    public static String calcGrades(int grade){
        if(grade>90)
            return "AA";
        else if(grade>80)
            return "AB";
        else if(grade>70)
            return "BB";
        else if(grade>60)
            return "BC";
        else if(grade>50)
            return "CD";
        else if(grade>40)
            return "DD";
        else
            return "Fail";
    }
    public static void main(String[] args){
        System.out.println("Enter the Number of Students");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] marks = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the Grade of Student "+(i+1));
            marks[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println("Student "+(i+1)+" Grade is "+calcGrades(marks[i]));
        }
    }
}