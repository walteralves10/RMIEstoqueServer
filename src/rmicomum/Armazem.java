package rmicomum;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Armazem extends Remote {
    
    public String registro_autentificacao_funcionario() throws RemoteException;
    public String consulta_produtos_estoque() throws RemoteException;
    public String consulta_produtos_categoriaDeterminada() throws RemoteException;;
    public String fecha_pedido_venda() throws RemoteException;;
    
}
