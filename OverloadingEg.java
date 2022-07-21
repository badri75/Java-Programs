//Changing number of arguments
// class Adder{  
//     static int add(int a,int b){
//         return a+b;
//     }  
//     static int add(int a,int b,int c){
//         return a+b+c;
//     }  
// }  
// class OverloadingEg{  
//     public static void main(String[] args){  
//         System.out.println(Adder.add(11,11));  
//         System.out.println(Adder.add(11,11,11));  
//     }
// }

//Changing return type
// class Adder{  
//     static int add(int a, int b){
//         return a+b;
//     }  
//     static double add(double a, double b){
//         return a+b;
//     }  
// }  
// class OverloadingEg{  
//     public static void main(String[] args){  
//         System.out.println(Adder.add(11,11));  
//         System.out.println(Adder.add(12.3,12.6));  
//     }
// }

//Method overloading with type promotion
class OverloadingEg{  
    void sum(int a,long b){
        System.out.println(a+b);
    }  
    void sum(int a,int b,int c){
        System.out.println(a+b+c);
    }  
    public static void main(String args[]){  
        OverloadingEg obj=new OverloadingEg();  
        obj.sum(20,20);//now second int literal will be promoted to long  
        obj.sum(20,20,20);
    }  
}