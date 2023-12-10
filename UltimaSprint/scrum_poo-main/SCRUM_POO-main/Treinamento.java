// Classe para representar um treinamento
class Treinamento {
    private String nome;
    private int anoConclusao;

    public Treinamento(String nome, int anoConclusao) {
        this.nome = nome;
        this.anoConclusao = anoConclusao;
    }

    // Método para formatar o treinamento como uma string
    @Override
    public String toString() {
        return anoConclusao + ": " + nome;
    }
}