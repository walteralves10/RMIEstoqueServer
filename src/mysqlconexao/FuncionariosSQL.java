package mysqlconexao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class FuncionariosSQL {
    
    //valida caso usuario digite a senha errada
    public ArrayList selectValidador(String login, String senha){
        return mostrarValidador("SELECT * FROM funcionarios WHERE loginFuncionario = '"+login+"' "
                + "and senhaFuncionario = '"+senha+"' ");
    }
    private ArrayList mostrarValidador(String query){
        ArrayList <Funcionarios> list = new ArrayList<>();
        ResultSet rs = null;
        rs = Conect.getResultSet(query);
        try {
            while (rs.next()) {
                Funcionarios umFunc = new Funcionarios(rs.getInt("idFuncionario"), rs.getString("nomeFuncionario")
                ,rs.getString("emailFuncionario"),rs.getInt("statusFuncionario"),rs.getString("loginFuncionario")
                ,rs.getString("senhaFuncionario"));
                
                System.out.println("id:"+umFunc.getIdFuncionario()
                        + "\nnome:"+umFunc.getNomeFuncionario()
                        + "\nemail:"+umFunc.getEmailFuncionario()
                        + "\nstatus:"+umFunc.getStatusFuncionario()
                        + "\n\n");
                
                list.add(umFunc);
            }
            rs.close();
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        if(list.isEmpty()){
            String Erro = "Usuario ou senha invalida!";
            System.out.println(Erro);
        }
        return list;
    }
    
    
    
    //mostrar todos os usuarios
    public ArrayList selectTudo (){
        return mostraTudo("SELECT * FROM funcionarios");
    }
    
    private ArrayList mostraTudo(String query){
        ArrayList <Funcionarios> list = new ArrayList<>();
        ResultSet rs = null;
        rs = Conect.getResultSet(query);
        try {
            while (rs.next()) {
                Funcionarios umFunc = new Funcionarios(rs.getInt("idFuncionario"), rs.getString("nomeFuncionario")
                ,rs.getString("emailFuncionario"),rs.getInt("statusFuncionario"),rs.getString("loginFuncionario")
                ,rs.getString("senhaFuncionario"));
                
                System.out.println("id:"+umFunc.getIdFuncionario()
                        + "\nnome:"+umFunc.getNomeFuncionario()
                        + "\nemail:"+umFunc.getEmailFuncionario()
                        + "\nstatus:"+umFunc.getStatusFuncionario()
                        + "\nlogin:"+umFunc.getLoginFuncionario()
                        + "\nsenha:"+umFunc.getSenhaFuncionario() + "\n\n");
                
                list.add(umFunc);
            }
            rs.close();
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return list;
    }
    
}
