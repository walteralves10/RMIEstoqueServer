package mysqlconexao;

public class Funcionarios {
    
    private int idFuncionario;
    private String nomeFuncionario;
    private String emailFuncionario;             
    private int statusFuncionario;
    private String loginFuncionario;
    private String senhaFuncionario;
    
    public Funcionarios(){
        
    }

    public Funcionarios(int idFuncionario, String nomeFuncionario, String emailFuncionario, int statusFuncionario, String loginFuncionario, String senhaFuncionario) {
        this.idFuncionario = idFuncionario;
        this.nomeFuncionario = nomeFuncionario;
        this.emailFuncionario = emailFuncionario;
        this.statusFuncionario = statusFuncionario;
        this.loginFuncionario = loginFuncionario;
        this.senhaFuncionario = senhaFuncionario;
    }
    
    public int getIdFuncionario() {
        return idFuncionario;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public String getEmailFuncionario() {
        return emailFuncionario;
    }

    public int getStatusFuncionario() {
        return statusFuncionario;
    }

    public String getLoginFuncionario() {
        return loginFuncionario;
    }

    public String getSenhaFuncionario() {
        return senhaFuncionario;
    }
}
