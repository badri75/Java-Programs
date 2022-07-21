import java.util.*;

interface even{  
    void evnno(int n);  
}
interface odd{
    void oddno(int n);
}

class Pgm3_Inter implements even,odd{
    //static int arr[]=new int[20];
    public void evnno(int n){
        for(int i=0; i<n; i++){
            if(i%2 == 0){
                System.out.println(i);
            }
        }
    }
    public void oddno(int n){
        for(int i=0;i<n;i++){
            if(i%2 == 1){
                System.out.println(i);
            }
        }
    }
    public static void main(String args[]){
        Pgm3_Inter obj = new Pgm3_Inter();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit for Odd number");
        int n = sc.nextInt();
        obj.oddno(n);
        System.out.println("Enter the limit for Even number");
        n = sc.nextInt();
        obj.evnno(n);
    }  
}  