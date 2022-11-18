//implementation of interface
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class InterImple extends UnicastRemoteObject implements Interf {
    public InterImple() throws RemoteException {
        super();
    }
    public int add(int a, int b) {
        return a + b;
    }
    public int sub(int a, int b) {
        return a - b;
    }
    public int mul(int a, int b) {
        return a * b;
    }
    public int div(int a, int b) {
        return a / b;
    }
}