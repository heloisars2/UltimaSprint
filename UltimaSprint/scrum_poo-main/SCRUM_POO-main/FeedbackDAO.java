import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FeedbackDAO {
    private static final String INSERIR_FEEDBACK = "INSERT INTO feedbacks (funcionario_id, feedback_texto) VALUES (?, ?)";
    private static final String OBTER_TODOS_FEEDBACKS = "SELECT * FROM feedbacks";
    // Adicione mais consultas conforme necessário

    public void inserirFeedback(Feedback feedback) {
        try (Connection conexao = ConexaoBD.obterConexao();
             PreparedStatement stmt = conexao.prepareStatement(INSERIR_FEEDBACK)) {

            stmt.setInt(1, feedback.getFuncionarioId());
            stmt.setString(2, feedback.getFeedbackTexto());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(); // Lide com as exceções de maneira apropriada para seu aplicativo
        }
    }

    public List<Feedback> obterTodosFeedbacks() {
        List<Feedback> feedbacks = new ArrayList<>();

        try (Connection conexao = ConexaoBD.obterConexao();
             PreparedStatement stmt = conexao.prepareStatement(OBTER_TODOS_FEEDBACKS);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                int id = rs.getInt("id");
                int funcionarioId = rs.getInt("funcionario_id");
                String feedbackTexto = rs.getString("feedback_texto");

                Feedback feedback = new Feedback(id, funcionarioId, feedbackTexto);
                feedbacks.add(feedback);
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Lide com as exceções de maneira apropriada para seu aplicativo
        }

        return feedbacks;
    }
}