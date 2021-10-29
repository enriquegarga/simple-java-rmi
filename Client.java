import java.rmi.registry.Registry;
import java.util.Scanner;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.util.Scanner;

public class Client {
    private final static int port = 1099;
    
    
    /**
     * 
     * @param args
     */
    public static void main(String args[]) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", port);

            Vowels vowels = (Vowels)Naming.lookup("//localhost/Vowels");
            System.out.println("Conectado al puerto " + port + "\n-----------------------\n");
            
            String word = askForWord();
            System.out.println("La palabra " + word + " tiene " + vowels.count(word) + " vocales.");
            
        } catch(Exception e) {
            System.out.println("No se pudo conectar al servidor: " + e);
        }
    }

    public static String askForWord() {
        System.out.print("Escribe una cadena de texto para contar las vocales que contiene: ");

        Scanner input = new Scanner(System.in);
        String word = input.nextLine();

        return word;
        
    }
}