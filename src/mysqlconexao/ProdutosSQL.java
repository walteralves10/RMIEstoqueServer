package mysqlconexao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProdutosSQL {
    
    public ArrayList mostrar (){
        return mostra("SELECT * FROM produtos");
    }
    
    private ArrayList mostra (String query){
        ArrayList <Produtos> list = new ArrayList<>();
        ResultSet rs = null;
        rs = Conect.getResultSet(query);
        try {
            while (rs.next()) {
                Produtos umProd = new Produtos(rs.getInt("idProdutos"), rs.getString("descricaoProdutos")
                        , rs.getFloat("precoProdutos"), rs.getString("categoriaProdutos"));
                
                System.out.println("id:"+umProd.getIdProdutos()
                        + "\ndescricao:"+umProd.getDescricaoProdutos()
                        + "\npreco:"+umProd.getPrecoProdutos()
                        + "\ncategoria:"+umProd.getCategoriaProdutos() + "\n");
                
                list.add(umProd);
            }
            rs.close();
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return list;
    }
    
}
