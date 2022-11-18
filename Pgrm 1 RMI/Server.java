//server program for rmi
import java.rmi.Naming;

public class Server {
    public static void main(String args[]) {
        try {
            InterImple ar = new InterImple();
            Naming.rebind("rmi://localhost:1099/Interf", ar);
            System.out.println("Server ready");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

//  Terminal 1
//  start rmiregistry
//  java Server

//  Terminal 2
//  java AddClient