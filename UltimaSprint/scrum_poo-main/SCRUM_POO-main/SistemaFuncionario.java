// Este código é um sistema simples de informações de funcionários que permite aos
// usuários visualizar e atualizar suas informações pessoais, como nome, email e cargo.
import java.util.HashMap; // Importa a classe HashMap do pacote java.util
import java.util.Map; // Importa a interface Map do pacote java.util
import java.util.Scanner; // Importa a classe Scanner do pacote java.util

// Definindo a classe Funcionario para representar os funcionários
class Funcionario {
    private String nome; // Declara uma variável de instância para o nome do funcionário
    private String email; // Declara uma variável de instância para o email do funcionário
    private String cargo; // Declara uma variável de instância para o cargo do funcionário

    // Construtor para inicializar um funcionário com nome, email e cargo
    public Funcionario(String nome, String email, String cargo) {
        this.nome = nome; // Inicializa o nome do funcionário com o valor fornecido
        this.email = email; // Inicializa o email do funcionário com o valor fornecido
        this.cargo = cargo; // Inicializa o cargo do funcionário com o valor fornecido
    }

    public Funcionario(String string, String string2) {
    }

    // Getters e setters para os atributos nome, email e cargo
    public String getNome() { // Método getter para o nome
        return nome; // Retorna o valor do nome do funcionário
    }

    public void setNome(String nome) { // Método setter para o nome
        this.nome = nome; // Define o valor do nome do funcionário com o valor fornecido
    }

    public String getEmail() { // Método getter para o email
        return email; // Retorna o valor do email do funcionário
    }

    public void setEmail(String email) { // Método setter para o email
        this.email = email; // Define o valor do email do funcionário com o valor fornecido
    }

    public String getCargo() { // Método getter para o cargo
        return cargo; // Retorna o valor do cargo do funcionário
    }

    public void setCargo(String cargo) { // Método setter para o cargo
        this.cargo = cargo; // Define o valor do cargo do funcionário com o valor fornecido
    }

    // Método toString para exibir informações do funcionário
    @Override
    public String toString() {
        return "Nome: " + nome + "\nEmail: " + email + "\nCargo: " + cargo;
    }

    public String getSalario() {
        return null;
    }

    public void setEndereco(String endereco) {
    }
}

// Classe principal que contém o método main
public class SistemaFuncionario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para entrada do usuário
        Map<String, Funcionario> funcionarios = new HashMap<>(); // Cria um mapa para armazenar funcionários

        // Adicione alguns funcionários fictícios para fins de demonstração
        funcionarios.put("usuario1", new Funcionario("João", "joao@email.com", "Desenvolvedor"));
        funcionarios.put("usuario2", new Funcionario("Maria", "maria@email.com", "Gerente"));

        System.out.println("Digite seu nome de usuário: "); // Solicita o nome de usuário
        String username = scanner.nextLine(); // Lê o nome de usuário fornecido pelo usuário

        // Verifica se o funcionário existe no mapa
        Funcionario funcionario = funcionarios.get(username);
        if (funcionario != null) { // Se o funcionário existe
            System.out.println("Login bem-sucedido!");

            // Exibe as informações pessoais do funcionário
            System.out.println(funcionario);

            System.out.println("Deseja atualizar suas informações? (S/N)");
            String resposta = scanner.nextLine(); // Lê a resposta do usuário

            if (resposta.equalsIgnoreCase("S")) { // Se o usuário deseja atualizar as informações
                System.out.println("Digite seu novo nome: ");
                String novoNome = scanner.nextLine(); // Lê o novo nome

                funcionario.setNome(novoNome); // Atualiza o nome do funcionário

                System.out.println("Digite seu novo email: ");
                String novoEmail = scanner.nextLine(); // Lê o novo email

                funcionario.setEmail(novoEmail); // Atualiza o email do funcionário

                System.out.println("Digite seu novo cargo: ");
                String novoCargo = scanner.nextLine(); // Lê o novo cargo

                funcionario.setCargo(novoCargo); // Atualiza o cargo do funcionário

                System.out.println("Informações atualizadas com sucesso!");
                System.out.println(funcionario); // Exibe as informações atualizadas
            }
        } else {
            System.out.println("Usuário não encontrado."); // Se o funcionário não for encontrado
        }
        scanner.close();
    }
}
