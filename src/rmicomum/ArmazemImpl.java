package rmicomum;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Formatter;

public class ArmazemImpl extends UnicastRemoteObject implements Armazem{
    
    private static String SERVIDOR="localhost";
    private static Integer PORTA=1099;
    private static String SERVICO="ServicoArmazem";
    
    private String msgRecebida = "nenhuma mensagem";
    
    public static String getURI(){
        String uri = String.format("rmi://%s:%d/%s", SERVIDOR,PORTA,SERVICO);
        return uri;
    }
    
    public  ArmazemImpl() throws RemoteException{
        super();
    }

    @Override
    public String registro_autentificacao_funcionario() throws RemoteException {
        return null;
    }

    @Override
    public String consulta_produtos_estoque() throws RemoteException {
        return null;
    }

    @Override
    public String consulta_produtos_categoriaDeterminada() throws RemoteException {
        return null;
    }

    @Override
    public String fecha_pedido_venda() throws RemoteException {
        return null;
    }
    
    
    
}
