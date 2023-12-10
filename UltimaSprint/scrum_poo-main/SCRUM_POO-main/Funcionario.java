import java.util.ArrayList;
import java.util.List;

class Funcionario {
    // Atributos privados que armazenam informações do funcionário
    private String nome;      // Nome do funcionário
    private String endereco;  // Endereço do funcionário
    private String telefone;  // Número de telefone do funcionário
    private String email;     // Endereço de email do funcionário
    private String cargo;     // Cargo do funcionário
    private double salario;   // Salário do funcionário
    private List<Feedback> feedbacks; // Lista de feedbacks do funcionário
    private List<HistoricoEmprego> historicoEmpregos; // Lista de históricos de emprego do funcionário
    private List<Treinamento> treinamentos; // Lista de treinamentos do funcionário

    // Construtor da classe Funcionario
    // Construtor da classe Funcionario
    public Funcionario(String nome, String endereco, String telefone, String email, String cargo, double salario) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.cargo = cargo;
        this.salario = salario;
        
        feedbacks = new ArrayList<>();
        historicoEmpregos = new ArrayList<>();
        treinamentos = new ArrayList<>();
    }


    // Métodos getter e setter para os atributos existentes
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Métodos getter e setter para as listas de feedbacks, históricos de emprego e treinamentos
    public List<Feedback> getFeedbacks() {
        return feedbacks;
    }

    public List<HistoricoEmprego> getHistoricoEmpregos() {
        return historicoEmpregos;
    }

    public List<Treinamento> getTreinamentos() {
        return treinamentos;
    }

    // Métodos para adicionar feedbacks, históricos de emprego e treinamentos
    public void adicionarFeedback(Feedback feedback) {
        feedbacks.add(feedback);
    }

    public void adicionarHistoricoEmprego(HistoricoEmprego historico) {
        historicoEmpregos.add(historico);
    }

    public void adicionarTreinamento(Treinamento treinamento) {
        treinamentos.add(treinamento);
    }

    public void exibirResumo() {
        System.out.println("Nome: " + nome);

        System.out.println("Histórico de Empregos:");
        for (HistoricoEmprego historico : historicoEmpregos) {
            System.out.println("- " + historico);
        }

        System.out.println("Treinamentos Concluídos:");
        for (Treinamento treinamento : treinamentos) {
            System.out.println("- " + treinamento);
        }

        System.out.println("Feedbacks Recebidos:");
        for (Feedback feedback : feedbacks) {
            System.out.println("- " + feedback);
        }
    }
}