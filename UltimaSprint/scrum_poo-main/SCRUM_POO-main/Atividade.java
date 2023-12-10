import java.util.ArrayList;

class Atividade {
    private int capacidade;
    private ArrayList<Associado> associadosInscritos;

    public Atividade(String nome, int capacidade) {
        this.capacidade = capacidade;
        this.associadosInscritos = new ArrayList<>();
    }

    public Atividade(String string, String string2, String string3) {
    }

    public boolean inscreverAssociado(Associado associado) {
        if (associadosInscritos.size() < capacidade) {
            associadosInscritos.add(associado);
            return true;
        } else {
            return false; // Capacidade da atividade atingida
        }
    }

    public void adicionarNivelHabilidade(String string) {
    }

    public String getNome() {
        return null;
    }

    public int getCapacidade() {
        return 0;
    }
}
