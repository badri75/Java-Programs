//server program for rmi
import java.rmi.*;

public class AddServer {
    public static void main(String args[]) {
        try {
            AddRemImpl ar = new AddRemImpl();
            Naming.rebind("rmi://localhost:1099/AddRem", ar);
            System.out.println("Server ready");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

//Terminal 1
//javac AddRemImpl.java
//javac AddServer.java
//start rmiregistry
//java AddServer

//Terminal 2
//javac AddRem.java
//javac AddClient.java
//java AddClient