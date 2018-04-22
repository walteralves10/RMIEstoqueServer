package Testes;

import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import mysqlconexao.FuncionariosSQL;
import mysqlconexao.ProdutosSQL;
import rmicomum.ArmazemImpl;

public class Testes {
    
    public static void main(String[] args) {
        
        try {
            //ProdutosSQL produtos_do_Banco = new ProdutosSQL();
            //produtos_do_Banco.selectTudo();
            
            //FuncionariosSQL funcionarios_do_banco = new FuncionariosSQL();
            //funcionarios_do_banco.selectValidador("walter", "walter");

            ArmazemImpl im = new ArmazemImpl();
            //im.registro_autentificacao_funcionario("walter", "walter");
            //im.consulta_todosProdutos_estoque();
            //im.consulta_Produtos_nomeEstoque("fenda");
            //im.consulta_produtos_categoriaDeterminada("chave");
            //im.fecha_pedido_venda("Alicate de Pressão 10 Pol",2);
            
        } catch (RemoteException ex) {
            Logger.getLogger(Testes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
