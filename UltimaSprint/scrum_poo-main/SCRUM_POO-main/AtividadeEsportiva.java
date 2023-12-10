import java.util.ArrayList;
import java.util.List;

class AtividadeEsportiva {
    private String nome;
    private String horario;
    private String descricao;
    private String instrutor;
    private String nivelHabilidade;
    private String faixaEtariaIndicada;
    private List<String> niveisHabilidade;
    private List<Turma> turmas;

    public AtividadeEsportiva(String nome, String horario, String descricao, String instrutor, String nivelHabilidade) {
        this.nome = nome;
        this.horario = horario;
        this.descricao = descricao;
        this.instrutor = instrutor;
        this.nivelHabilidade = nivelHabilidade;
        this.turmas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getHorario() {
        return horario;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public String getNivelHabilidade() {
        return nivelHabilidade;
    }

    public String getFaixaEtariaIndicada() {
        return faixaEtariaIndicada;
    }

    public void setFaixaEtariaIndicada(String faixaEtariaIndicada) {
        this.faixaEtariaIndicada = faixaEtariaIndicada;
    }

    // Getter e Setter para niveisHabilidade
    public List<String> getNiveisHabilidade() {
        return niveisHabilidade;
    }

    public void adicionarNivelHabilidade(String nivel) {
        this.niveisHabilidade.add(nivel);
    }

    // Getter e Setter para turmas
    public List<Turma> getTurmas() {
        return turmas;
    }

    public void adicionarTurma(Turma turma) {
        this.turmas.add(turma);
    }

    @Override
    public String toString() {
        return "Atividade: " + nome + "\nHorário: " + horario + "\nDescrição: " + descricao + "\nInstrutor: " + instrutor + "\nFaixa Etaria Indicada" + faixaEtariaIndicada + "\n Turma" + turmas;
    }
}
