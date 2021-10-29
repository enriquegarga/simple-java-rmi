import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RMI extends UnicastRemoteObject implements Vowels {
    /**
     * 
     * @throws RemoteException
     */
    protected RMI() throws RemoteException {
        super();
    }

    @Override
    public int count(String word) throws RemoteException {
        int vowels = 0;
        word = word.toLowerCase();
        for(int i = 0; i < word.length(); i++) {
            // Recorre la enumeración y compara cada valor del mismo con el caracter de la palabra en cuestión
            for(VowelsEnum vowel: VowelsEnum.values()) {
                if(vowel.charValue() == word.charAt(i)) {
                    vowels++;
                }
            }
        }
        return vowels;
    }
}