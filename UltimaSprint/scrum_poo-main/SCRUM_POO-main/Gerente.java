import java.util.List;

public class Gerente {
    public static void main(String[] args) {
        // Criar um funcionário e adicionar informações
        Funcionario funcionario = new Funcionario("João Silva", "Rua ABC, 123", "123-456-7890", "joao@email.com", "Gerente de Vendas", 5000.00);
        funcionario.adicionarHistoricoEmprego(new HistoricoEmprego("Empresa A", "Gerente de Vendas", 2010, 2015));
        funcionario.adicionarTreinamento(new Treinamento("Curso de Liderança", 2012));
        funcionario.adicionarFeedback(new Feedback("Excelente trabalho no último projeto"));

        // Exibir resumo do funcionário
        funcionario.exibirResumo();


        // Criar um funcionário
        Funcionario funcionario2 = new Funcionario("João Silva", "Rua ABC, 123", "123-456-7890", "joao@email.com", "Gerente de Vendas", 5000.00);


        // Adicionar feedbacks
        Feedback feedback1 = new Feedback("Ótimo desempenho!");
        funcionario2.adicionarFeedback(feedback1);

        Feedback feedback2 = new Feedback("Precisa melhorar a comunicação.");
        funcionario2.adicionarFeedback(feedback2);

        // Adicionar históricos de emprego
        HistoricoEmprego historico1 = new HistoricoEmprego("Empresa A", "Cargo X", 2010, 2015);
        funcionario2.adicionarHistoricoEmprego(historico1);

        HistoricoEmprego historico2 = new HistoricoEmprego("Empresa B", "Cargo Y", 2016, 2020);
        funcionario2.adicionarHistoricoEmprego(historico2);

        // Adicionar treinamentos
        Treinamento treinamento1 = new Treinamento("Curso de Liderança", 2013);
        funcionario2.adicionarTreinamento(treinamento1);

        Treinamento treinamento2 = new Treinamento("Curso de Programação Avançada", 2018);
        funcionario2.adicionarTreinamento(treinamento2);

        // Acessar as informações
        // Listar informações do funcionário, incluindo feedbacks, históricos de emprego e treinamentos
        System.out.println("Informações do Funcionário:");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Endereço: " + funcionario.getEndereco());
        System.out.println("Telefone: " + funcionario.getTelefone());
        System.out.println("E-mail: " + funcionario.getEmail());
        System.out.println("Cargo: " + funcionario.getCargo());
        System.out.println("Salário: " + funcionario.getSalario());

        System.out.println("\nFeedbacks do Funcionário:");
        List<Feedback> feedbacksDoFuncionario = funcionario.getFeedbacks();
        for (Feedback feedback : feedbacksDoFuncionario) {
            System.out.println("- " + feedback);
        }

        System.out.println("\nHistóricos de Emprego do Funcionário:");
        List<HistoricoEmprego> historicosDoFuncionario = funcionario.getHistoricoEmpregos();
        for (HistoricoEmprego historico : historicosDoFuncionario) {
            System.out.println("- " + historico);
        }

        System.out.println("\nTreinamentos do Funcionário:");
        List<Treinamento> treinamentosDoFuncionario = funcionario.getTreinamentos();
        for (Treinamento treinamento : treinamentosDoFuncionario) {
            System.out.println("- " + treinamento);
        }

        // Restante das operações com o funcionário...

    }
}