class Dependente {
    private String nome;
    private int idade;

    //constructor
    public Dependente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Dependente(int id, String nome2, int idade2) {
    }

    // Getter para nome
    public String getNome() {
        return nome;
    }

    // Setter para nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter para idade
    public int getIdade() {
        return idade;
    }

    // Setter para idade
    public void setIdade(int idade) {
        this.idade = idade;
    }
}
