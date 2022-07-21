import java.util.*;

class Pgm2_Stud{
    int rollno, ev1, ev2, ev3, tot;
    String name;
    String pgm;
    public static int random(){
        int r = (int)(Math.random()*10000);
        return r;
    }
    public Pgm2_Stud(String name, String pgm, int ev1, int ev2, int ev3) {
        this.rollno = random();
        this.name = name;
        this.pgm = pgm;
        this.ev1 = ev1;
        this.ev2 = ev2;
        this.ev3 = ev3;
        this.tot = ev1+ev2+ev3;
    }
    public void display(){
        System.out.println("\nRollno: "+rollno);
        System.out.println("Name: "+name);
        System.out.println("Program: "+pgm);
        System.out.println("Total: "+tot);
    }

    public static void main(String args[]){
        int n, i, j, t1=100, t2=100, t3=100, t1i=0, t2i=0, t3i=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students");
        n = sc.nextInt();
        Pgm2_Stud[] stud = new Pgm2_Stud[n];
        for (i = 0; i < n; i++) {
            j = i+1;
            System.out.println("Enter the name of student "+j);
            String name = sc.next();
            System.out.println("Enter the program of student");
            String pgm = sc.next();
            System.out.println("Enter the marks of three subjects");
            int ev1 = sc.nextInt();
            int ev2 = sc.nextInt();
            int ev3 = sc.nextInt();
            stud[i] = new Pgm2_Stud(name, pgm, ev1, ev2, ev3);
        }
        for (i = 0; i < n; i++) {
            stud[i].display();
            if(stud[i].ev1 < t1){
                t1 = stud[i].ev1;
                t1i = i;
            }
            if(stud[i].ev2 < t2){
                t2 = stud[i].ev2;
                t2i = i;
            }
            if(stud[i].ev3 < t3){
                t3 = stud[i].ev3;
                t3i = i;
            }
        }
        System.out.println("The minimum marks of ev1 is "+t1+" by "+stud[t1i].name);
        System.out.println("The minimum marks of ev2 is "+t2+" by "+stud[t2i].name);
        System.out.println("The minimum marks of ev3 is "+t3+" by "+stud[t3i].name);
    }
}