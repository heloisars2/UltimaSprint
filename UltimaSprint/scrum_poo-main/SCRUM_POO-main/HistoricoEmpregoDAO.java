import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class HistoricoEmpregoDAO {
    private static final String INSERIR_HISTORICO_EMPREGO = "INSERT INTO historicos_emprego (funcionario_id, empresa, cargo, ano_inicio, ano_fim) VALUES (?, ?, ?, ?, ?)";
    private static final String OBTER_TODOS_HISTORICOS_EMPREGO = "SELECT * FROM historicos_emprego";
    // Adicione mais consultas conforme necessário

    public void inserirHistoricoEmprego(HistoricoEmprego historicoEmprego) {
        try (Connection conexao = ConexaoBD.obterConexao();
             PreparedStatement stmt = conexao.prepareStatement(INSERIR_HISTORICO_EMPREGO)) {

            stmt.setInt(1, historicoEmprego.getFuncionarioId());
            stmt.setString(2, historicoEmprego.getEmpresa());
            stmt.setString(3, historicoEmprego.getCargo());
            stmt.setInt(4, historicoEmprego.getAnoInicio());
            stmt.setInt(5, historicoEmprego.getAnoInicio());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(); // Lide com as exceções de maneira apropriada para seu aplicativo
        }
    }

    public List<HistoricoEmprego> obterTodosHistoricosEmprego() {
        List<HistoricoEmprego> historicosEmprego = new ArrayList<>();

        try (Connection conexao = ConexaoBD.obterConexao();
             PreparedStatement stmt = conexao.prepareStatement(OBTER_TODOS_HISTORICOS_EMPREGO);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                int id = rs.getInt("id");
                int funcionarioId = rs.getInt("funcionario_id");
                String empresa = rs.getString("empresa");
                String cargo = rs.getString("cargo");
                int anoInicio = rs.getInt("ano_inicio");
                int anoFim = rs.getInt("ano_fim");

                HistoricoEmprego historicoEmprego = new HistoricoEmprego(id, funcionarioId, empresa, cargo, anoInicio, anoFim);
                historicosEmprego.add(historicoEmprego);
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Lide com as exceções de maneira apropriada para seu aplicativo
        }

        return historicosEmprego;
    }

}