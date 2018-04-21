package mysqlconexao;

public class Produtos {
    
    private int idProdutos;
    private String descricaoProdutos;
    private float precoProdutos;
    private String categoriaProdutos;

    public Produtos(int idProdutos, String descricaoProdutos, float precoProdutos, String categoriaProdutos) {
        this.idProdutos = idProdutos;
        this.descricaoProdutos = descricaoProdutos;
        this.precoProdutos = precoProdutos;
        this.categoriaProdutos = categoriaProdutos;
    }

    
    
    public int getIdProdutos() {
        return idProdutos;
    }

    public String getDescricaoProdutos() {
        return descricaoProdutos;
    }

    public float getPrecoProdutos() {
        return precoProdutos;
    }

    public String getCategoriaProdutos() {
        return categoriaProdutos;
    }
    
    
    
}
