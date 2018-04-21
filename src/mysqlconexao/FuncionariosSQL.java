package mysqlconexao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class FuncionariosSQL {
    
    public ArrayList mostrar (){
        return mostra("SELECT * FROM funcionarios");
    }
    
    private ArrayList mostra (String query){
        ArrayList <Funcionarios> list = new ArrayList<>();
        ResultSet rs = null;
        rs = Conect.getResultSet(query);
        try {
            while (rs.next()) {
                Funcionarios umFunc = new Funcionarios(rs.getInt("idFuncionario"), rs.getString("nomeFuncionario")
                ,rs.getString("emailFuncionario"),rs.getInt("statusFuncionario"),rs.getString("loginFuncionario")
                ,rs.getString("senhaFuncionario"));
                
                System.err.println("id:"+umFunc.getIdFuncionario()
                        + "nome:"+umFunc.getNomeFuncionario()
                        + "email:"+umFunc.getEmailFuncionario()
                        + "status:"+umFunc.getStatusFuncionario()
                        + "login:"+umFunc.getLoginFuncionario()
                        + "senha:"+umFunc.getSenhaFuncionario());
                
                list.add(umFunc);
            }
            rs.close();
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return list;
    }
    
}
