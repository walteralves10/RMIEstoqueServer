package rmicomum;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface Armazem extends Remote {
    
    public ArrayList registro_autentificacao_funcionario(String logim, String senha) throws RemoteException;
    public ArrayList consulta_todosProdutos_estoque() throws RemoteException;
    public ArrayList consulta_Produtos_nomeEstoque(String nome) throws RemoteException;
    public ArrayList consulta_produtos_categoriaDeterminada(String categoria) throws RemoteException;
    public ArrayList fecha_pedido_venda(String descricao, int quantidade) throws RemoteException;;
    
}
