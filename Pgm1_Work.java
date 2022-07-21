import java.util.*;
class Work{
    public static void main(String[] args){
        ArrayList <Integer> arr=new ArrayList<Integer>();
        ArrayList <Integer> ar=new ArrayList<Integer>();
        int a[][]={{3,5,2,8,1,9,5},{2,5,8,5,2,9,8},{3,7,5,9,2,2,3}};
        String f[]={"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
        int sm=0;
        for(String v:f){
            System.out.println(v);
        }
        for(int i=0;i<3;i++){
            System.out.print("EMP ID"+i+" ");
            for(int j=0;j<7;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        Scanner s=new Scanner(System.in);
        System.out.println("enter the emp id");
        int g=s.nextInt();
        for(int l=0;l<a[0].length;l++){
            sm=sm+a[g][l];
            arr.add(sm);
            sm=0;
        }
        int m=Collections.max(arr);
        System.out.println("the most working day of the emp"+g+" is "+(f[(arr.indexOf(m)+1)-1]));
        System.out.println("enter the day");
        Scanner u=new Scanner(System.in);
        int b=u.nextInt();
        int q=0;
        System.out.println(a.length);
        for(int c=0;c<=(a.length)-1;c++){
            q=q+a[c][b];
            ar.add(q);
            q=0;
        }
        int x=Collections.max(ar);
        System.out.println("the most working emp is EMP "+(ar.indexOf(x)+1));
    }
}