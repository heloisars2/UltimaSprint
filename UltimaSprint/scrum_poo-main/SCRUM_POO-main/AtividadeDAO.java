import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AtividadeDAO {
    private static final String INSERIR_ATIVIDADE = "INSERT INTO atividades (nome, capacidade) VALUES (?, ?)";
    private static final String OBTER_TODAS_ATIVIDADES = "SELECT * FROM atividades";
    // Adicione mais consultas conforme necessário

    public void inserirAtividade(Atividade atividade) {
        try (Connection conexao = ConexaoBD.obterConexao();
             PreparedStatement stmt = conexao.prepareStatement(INSERIR_ATIVIDADE)) {

            stmt.setString(1, atividade.getNome());
            stmt.setInt(2, atividade.getCapacidade());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(); // Lide com as exceções de maneira apropriada para seu aplicativo
        }
    }

    public List<Atividade> obterTodasAtividades() {
        List<Atividade> atividades = new ArrayList<>();

        try (Connection conexao = ConexaoBD.obterConexao();
             PreparedStatement stmt = conexao.prepareStatement(OBTER_TODAS_ATIVIDADES);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                String nome = rs.getString("nome");
                int capacidade = rs.getInt("capacidade");

                Atividade atividade = new Atividade(nome, capacidade);
                atividades.add(atividade);
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Lide com as exceções de maneira apropriada para seu aplicativo
        }

        return atividades;
    }
}