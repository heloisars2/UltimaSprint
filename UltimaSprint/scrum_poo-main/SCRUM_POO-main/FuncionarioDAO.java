import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FuncionarioDAO {
    private static final String INSERIR_FUNCIONARIO = "INSERT INTO funcionario (nome, endereco, telefone, email, cargo, salario) VALUES (?, ?, ?, ?, ?, ?)";
    
    public void inserirFuncionario(Funcionario funcionario) {
        try (Connection conexao = ConexaoBD.obterConexao();
             PreparedStatement stmt = conexao.prepareStatement(INSERIR_FUNCIONARIO)) {

            stmt.setString(1, funcionario.getNome());
            stmt.setString(4, funcionario.getEmail());
            stmt.setString(5, funcionario.getCargo());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(); 
        }
    }

}