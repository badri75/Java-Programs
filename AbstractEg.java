//Example 1
// abstract class Bike{  
//     abstract void run();  
//   }
   
// class AbstractEg extends Bike{  
//     void run(){
//         System.out.println("running safely");
//     }  
//     public static void main(String args[]){  
//         Bike obj = new AbstractEg();  
//         obj.run();  
//     }  
// }

//Example 2
// abstract class Shape{  
//     abstract void draw();  
// }  
// class Rectangle extends Shape{  
//     void draw(){System.out.println("drawing rectangle");}  
// }  
// class Circle1 extends Shape{  
//     void draw(){System.out.println("drawing circle");}  
// }  
// class AbstractEg{  
//     public static void main(String args[]){  
//         Shape s=new Circle1();
//         s.draw();
//     }
// }

//Example 3
abstract class Bank{    
    abstract int getRateOfInterest();    
}
class SBI extends Bank{    
    int getRateOfInterest(){return 7;}    
}
class PNB extends Bank{    
    int getRateOfInterest(){return 8;}    
}
class AbstractEg{
    public static void main(String args[]){    
        Bank b;
        b=new SBI();
        System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");
        b=new PNB();
        System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");
    }
}