//Program 1
// class Vehicle{
//     void run(){
//         System.out.println("Vehicle is running");
//     }  
// } 
// class OvrridingEg extends Vehicle{ 
//     void run(){
//         System.out.println("Bike is running safely");
//     }  
//     public static void main(String args[]){  
//         OvrridingEg obj = new OvrridingEg();
//         obj.run();
//     }  
// }

//Program 2 (super)
// class Animal {
//     public void displayInfo() {
//        System.out.println("I am an animal.");
//     }
//  }
 
//  class Dog extends Animal {
//     public void displayInfo() {
//        super.displayInfo();
//        System.out.println("I am a dog.");
//     }
//  }
 
//  class OverridingEg {
//     public static void main(String[] args) {
//         System.out.println("Program 2");
//        Dog d1 = new Dog();
//        d1.displayInfo();
//     }
// }
 
//Program 3 (access specifier)
class Animal {
    protected void displayInfo() {
       System.out.println("I am an animal.");
    }
 }
 
 class Dog extends Animal {
    public void displayInfo() {
       System.out.println("I am a dog.");
    }
 }
 
 class OverridingEg {
    public static void main(String[] args) {
       Dog d1 = new Dog();
       d1.displayInfo();
    }
 }
 