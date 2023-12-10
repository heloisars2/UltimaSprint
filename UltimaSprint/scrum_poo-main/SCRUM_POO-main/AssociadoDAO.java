import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class AssociadoDAO {
    private static final String INSERIR_ASSOCIADO = "INSERT INTO associados (nome, endereco, telefone, email, pagamento_mensal, forma_pagamento) VALUES (?, ?, ?, ?, ?, ?)";
    private static final String OBTER_TODOS_ASSOCIADOS = "SELECT * FROM associados";
    // Adicione mais consultas conforme necessário

    public void inserirAssociado(Associado associado) {
        try (Connection conexao = ConexaoBD.obterConexao();
             PreparedStatement stmt = conexao.prepareStatement(INSERIR_ASSOCIADO)) {

            stmt.setString(1, associado.getNome());
            stmt.setString(2, associado.getEndereco());
            stmt.setString(3, associado.getTelefone());
            stmt.setString(4, associado.getEmail());
            stmt.setDouble(5, associado.getPagamentoMensal());
            stmt.setString(6, associado.getFormaPagamento());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(); 
    }
}
    public List<Associado> obterTodosAssociados() {
        List<Associado> associados = new ArrayList<>();

        try (Connection conexao = ConexaoBD.obterConexao();
             PreparedStatement stmt = conexao.prepareStatement(OBTER_TODOS_ASSOCIADOS);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String endereco = rs.getString("endereco");
                String telefone = rs.getString("telefone");
                String email = rs.getString("email");
                double pagamentoMensal = rs.getDouble("pagamento_mensal");
                String formaPagamento = rs.getString("forma_pagamento");

                Associado associado = new Associado(nome, id, endereco, telefone, email, pagamentoMensal, formaPagamento);
                associados.add(associado);
            }
        } catch (SQLException e) {
            e.printStackTrace(); 
        }

        return associados;
    }
}

