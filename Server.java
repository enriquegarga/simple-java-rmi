import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;

public class Server {
    private final static int port = 1099;

    /**
     * 
     * @param args
     */
    public static void main(String args[]) {
        try {
            Registry registry = LocateRegistry.createRegistry(port);
            registry.rebind("Vowels", new RMI());

            System.out.println("Servidor iniciado: " + port);
        } catch(Exception e ) {
            System.out.println("No se pudo iniciar el servidor: " + e);
        }
    }
}
