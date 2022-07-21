//Example 1
class StaticEg{  
    static int cube(int x){  
    return x*x*x;  
    }  
    
    public static void main(String args[]){  
    int result=StaticEg.cube(5);  
    System.out.println(result);  
    }  
  }

//Example 2
// class StaticEg{  
//   static{System.out.println("static block is invoked");}  
//   public static void main(String args[]){  
//     System.out.println("Hello main");  
//   }  
// }

//Example 3
// class StaticEg{  
//   static int count=0;
    
//   StaticEg(){  
//     count++;
//     System.out.println(count);
//   }  
    
//   public static void main(String args[]){  
//     StaticEg c1=new StaticEg();  
//     StaticEg c2=new StaticEg();  
//     StaticEg c3=new StaticEg();
//   }  
// }