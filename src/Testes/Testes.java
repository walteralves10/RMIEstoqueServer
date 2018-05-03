package Testes;

import java.rmi.RemoteException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import mysqlconexao.FuncionariosSQL;
import mysqlconexao.ProdutosSQL;
import rmicomum.ArmazemImpl;

public class Testes {
        public static String login,senha,nomeProduto,nomeCategoria;
        public static int opcao,quantidadeProduto;
        public static Scanner ler = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        try {
            
            ArmazemImpl im = new ArmazemImpl();
            do{
                
            //menu
            System.out.println("Digite login: ");
            login = ler.next();
            
            System.out.println("Digite senha: ");
            senha = ler.next();
            
            }while(im.registro_autentificacao_funcionario(login, senha).isEmpty());
            do{
                System.out.println("digite o tipo de consulta/Fechar venda: \n"
                    + "1 - consulta_todosProdutos_estoque: \n"
                    + "2 - consulta_Produtos_nomeEstoque: \n"
                    + "3 - consulta_produtos_categoriaDeterminada: \n"
                    + "4 - fecha_pedido_venda: ");
            
            opcao = ler.nextInt();
            switch (opcao){
                case 1:
                    im.consulta_todosProdutos_estoque();
                    break;
                case 2:
                    System.out.println("Digite o nome do produto: ");
                    nomeProduto = ler.next();
                    im.consulta_Produtos_nomeEstoque(nomeProduto);
                    break;
                case 3:
                    System.out.println("Digite o nome da categoria: ");
                    nomeCategoria = ler.next();
                    im.consulta_produtos_categoriaDeterminada(nomeCategoria);
                    break;
                case 4:
                    System.out.println("Digite o nome do produto: ");
                    //AlicatePressão10Pol
                    nomeProduto = ler.next();
                    
                    System.out.println("Digite a quantidade do produto: ");
                    quantidadeProduto = ler.nextInt();
                    
                    im.fecha_pedido_venda(nomeProduto,quantidadeProduto);
                    break;
                default:
                    System.err.println("finalizado!");
            }
            }while(opcao!=0);
            
            
            //ProdutosSQL produtos_do_Banco = new ProdutosSQL();
            //produtos_do_Banco.selectTudo();
            
            //FuncionariosSQL funcionarios_do_banco = new FuncionariosSQL();
            //funcionarios_do_banco.selectValidador("walter", "walter");

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
