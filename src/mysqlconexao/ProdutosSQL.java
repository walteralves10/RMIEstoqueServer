package mysqlconexao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProdutosSQL {
    
    public ArrayList selectQuantidadeProduto(String descricao, int quantidade){
        return mostraQuantidadeProduto("SELECT * FROM produtos WHERE descricaoProdutos = '"+descricao+"' and quantidadeProdutos > '"+quantidade+"'");
    }
    private ArrayList mostraQuantidadeProduto(String query){
        ArrayList <Produtos> list = new ArrayList<>();
        ResultSet rs = null;
        rs = Conect.getResultSet(query);
        try {
            while (rs.next()) {
                Produtos umProd = new Produtos(rs.getInt("idProdutos"), rs.getString("descricaoProdutos")
                        , rs.getFloat("precoProdutos"), rs.getString("categoriaProdutos"), rs.getInt("quantidadeProdutos"));
                
                System.out.println("id:"+umProd.getIdProdutos()
                        + "\ndescricao:"+umProd.getDescricaoProdutos()
                        + "\npreco:"+umProd.getPrecoProdutos()
                        + "\ncategoria:"+umProd.getCategoriaProdutos() 
                        + "\nquantidade:"+umProd.getQuantidadeProdutos()
                        + "\n");
                
                list.add(umProd);
            }
            rs.close();
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        if(list.isEmpty()){
            String Erro = "Estoque vazio!";
            System.out.println(Erro);
        }
        return list;
    }
    
    
    public ArrayList selectCategoriaProduto(String categoria){
        return mostraCategoriaProduto("SELECT * FROM produtos WHERE categoriaProdutos LIKE '%"+categoria+"%'");
    }
    private ArrayList mostraCategoriaProduto(String query){
        ArrayList <Produtos> list = new ArrayList<>();
        ResultSet rs = null;
        rs = Conect.getResultSet(query);
        try {
            while (rs.next()) {
                Produtos umProd = new Produtos(rs.getInt("idProdutos"), rs.getString("descricaoProdutos")
                        , rs.getFloat("precoProdutos"), rs.getString("categoriaProdutos"), rs.getInt("quantidadeProdutos"));
                
                System.out.println("id:"+umProd.getIdProdutos()
                        + "\ndescricao:"+umProd.getDescricaoProdutos()
                        + "\npreco:"+umProd.getPrecoProdutos()
                        + "\nquantidade:"+umProd.getQuantidadeProdutos()
                        + "\n");
                
                list.add(umProd);
            }
            rs.close();
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        if(list.isEmpty()){
            String Erro = "CATEGORIA nao encontrado!";
            System.out.println(Erro);
        }
        return list;
    }
    
    
    
    //mostar pela busca do nome do produto
    public ArrayList selectNomeProduto(String descricao){
        return mostraNomeProduto("SELECT * FROM produtos WHERE descricaoProdutos LIKE '%"+descricao+"%'");
    }
    private ArrayList mostraNomeProduto(String query){
        ArrayList <Produtos> list = new ArrayList<>();
        ResultSet rs = null;
        rs = Conect.getResultSet(query);
        try {
            while (rs.next()) {
                Produtos umProd = new Produtos(rs.getInt("idProdutos"), rs.getString("descricaoProdutos")
                        , rs.getFloat("precoProdutos"), rs.getString("categoriaProdutos"), rs.getInt("quantidadeProdutos"));
                
                System.out.println("id:"+umProd.getIdProdutos()
                        + "\ndescricao:"+umProd.getDescricaoProdutos()
                        + "\npreco:"+umProd.getPrecoProdutos()
                        + "\ncategoria:"+umProd.getCategoriaProdutos() 
                        + "\nquantidade:"+umProd.getQuantidadeProdutos()
                        + "\n");
                
                list.add(umProd);
            }
            rs.close();
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        if(list.isEmpty()){
            String Erro = "Produto nao encontrado!";
            System.out.println(Erro);
        }
        return list;
    }
    
    
    
    //Mostrar todos os produtos
    public ArrayList selectTudo (){
        return mostraTudo("SELECT * FROM produtos");
    }
    private ArrayList mostraTudo (String query){
        ArrayList <Produtos> list = new ArrayList<>();
        ResultSet rs = null;
        rs = Conect.getResultSet(query);
        try {
            while (rs.next()) {
                Produtos umProd = new Produtos(rs.getInt("idProdutos"), rs.getString("descricaoProdutos")
                        , rs.getFloat("precoProdutos"), rs.getString("categoriaProdutos"), rs.getInt("quantidadeProdutos"));
                
                System.out.println("id:"+umProd.getIdProdutos()
                        + "\ndescricao:"+umProd.getDescricaoProdutos()
                        + "\npreco:"+umProd.getPrecoProdutos()
                        + "\ncategoria:"+umProd.getCategoriaProdutos() 
                        + "\nquantidade:"+umProd.getQuantidadeProdutos()
                        + "\n");
                
                list.add(umProd);
            }
            rs.close();
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return list;
    }
    
}
