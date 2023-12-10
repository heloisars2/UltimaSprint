import java.util.ArrayList;
import java.util.List;
public class ClubeEsportivo {
    private List<AtividadeEsportiva> atividades;

    public ClubeEsportivo() {
        atividades = new ArrayList<>();
    }

    public void adicionarAtividade(AtividadeEsportiva atividade) {
        atividades.add(atividade);
    }

    public List<AtividadeEsportiva> listarAtividades() {
        return atividades;
    }
}
