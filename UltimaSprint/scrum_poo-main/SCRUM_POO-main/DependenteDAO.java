import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DependenteDAO {
    private static final String INSERIR_DEPENDENTE = "INSERT INTO dependentes (nome, idade) VALUES (?, ?)";
    private static final String OBTER_TODOS_DEPENDENTES = "SELECT * FROM dependentes";
    // Adicione mais consultas conforme necessário

    public void inserirDependente(Dependente dependente) {
        try (Connection conexao = ConexaoBD.obterConexao();
             PreparedStatement stmt = conexao.prepareStatement(INSERIR_DEPENDENTE)) {

            stmt.setString(1, dependente.getNome());
            stmt.setInt(2, dependente.getIdade());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(); // Lide com as exceções de maneira apropriada para seu aplicativo
        }
    }

    public List<Dependente> obterTodosDependentes() {
        List<Dependente> dependentes = new ArrayList<>();

        try (Connection conexao = ConexaoBD.obterConexao();
             PreparedStatement stmt = conexao.prepareStatement(OBTER_TODOS_DEPENDENTES);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                int idade = rs.getInt("idade");

                Dependente dependente = new Dependente(id, nome, idade);
                dependentes.add(dependente);
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Lide com as exceções de maneira apropriada para seu aplicativo
        }

        return dependentes;
    }
}