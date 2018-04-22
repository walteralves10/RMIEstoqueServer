package rmicomum;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Formatter;
import mysqlconexao.Funcionarios;
import mysqlconexao.FuncionariosSQL;
import mysqlconexao.ProdutosSQL;

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
    public ArrayList registro_autentificacao_funcionario(String logim, String senha) throws RemoteException {
        FuncionariosSQL func = new FuncionariosSQL();
        return func.selectValidador(logim, senha);   
    }

    @Override
    public ArrayList consulta_todosProdutos_estoque() throws RemoteException {
        ProdutosSQL prod = new ProdutosSQL();
        return prod.selectTudo(); 
    }
    @Override
    public ArrayList consulta_Produtos_nomeEstoque(String nome) throws RemoteException{
        ProdutosSQL prod = new ProdutosSQL();
        return prod.selectNomeProduto(nome);
    }
    @Override
    public ArrayList consulta_produtos_categoriaDeterminada(String categoria) throws RemoteException {
        ProdutosSQL prod = new ProdutosSQL();
        return prod.selectCategoriaProduto(categoria);
    }

    @Override
    public ArrayList fecha_pedido_venda(String descricao, int quantidade) throws RemoteException {
        ProdutosSQL prod = new ProdutosSQL();
        return prod.selectQuantidadeProduto(descricao,quantidade);
    }
    
    
    
}
