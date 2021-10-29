import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Vowels extends Remote {
    /**
     * 
     * @param word
     * @return número de vocales de una palabra
     * @throws RemoteException
     */
    public int count(String word) throws RemoteException;
}