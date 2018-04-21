package rmiserver;

import java.rmi.Naming;
import rmicomum.Armazem;
import rmicomum.ArmazemImpl;

public class ArmazemServer {
    
        public ArmazemServer(){
        try {
            Armazem a = new ArmazemImpl();
            Naming.rebind(ArmazemImpl.getURI(),a);
            
        } catch (Exception e) {
            System.out.println("Erro "+ e);
        }
    }
    
    public static void main(String[] args) {
        new ArmazemServer();
    }
    
}
