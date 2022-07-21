//Example 1
// interface printable{
//     void print();
// }

// class InterfaceEg implements printable{  
//     public void print(){
//         System.out.println("Hello");
//     }  
//     public static void main(String args[]){  
//         InterfaceEg obj = new InterfaceEg();  
//         obj.print();  
//     }
// }

//Example 2
// interface Drawable{  
//     void draw();  
// }
// class Rectangle implements Drawable{  
//     public void draw(){
//         System.out.println("drawing rectangle");
//     }  
// }  
// class Circle implements Drawable{  
//     public void draw(){
//         System.out.println("drawing circle");
//     }  
// }
// class InterfaceEg{
//     public static void main(String args[]){
//         Drawable d=new Circle();
//         d.draw();
//     }
// }

//Example 3
interface Bank{  
    float rateOfInterest();  
}  
class SBI implements Bank{  
    public float rateOfInterest(){
        return 9.15f;
    }  
}  
class PNB implements Bank{  
    public float rateOfInterest(){
        return 9.7f;
    }  
}  
class InterfaceEg{
    public static void main(String[] args){  
        Bank b=new SBI();
        System.out.println("ROI: "+b.rateOfInterest());
    }
}