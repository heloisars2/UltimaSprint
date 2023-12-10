//Heloísa Raquel Siebeneichler
class PermissoesFuncionario { // Definição da classe PermissoesFuncionario
    public static void gerenciarPermissoes(Funcionario funcionario) { // Método para gerenciar permissões com base no cargo do funcionário
        String cargo = funcionario.getCargo(); // Obtém o cargo do funcionário
        
        switch (cargo) { // Verifica o cargo do funcionário
            case "Estagiario": // Se for Estagiário
                exibirInformacoesBasicas(funcionario); // Chama a função para exibir informações básicas
                break;
            case "Funcionario": // Se for Funcionário
                exibirInformacoesBasicas(funcionario); // Chama a função para exibir informações básicas
                exibirInformacoesVendas(); // Chama a função para exibir informações de vendas
                break;
            case "Gerente": // Se for Gerente
                exibirInformacoesBasicas(funcionario); // Chama a função para exibir informações básicas
                exibirInformacoesFinanceiras(); // Chama a função para exibir informações financeiras
                permitirEdicao(); // Chama a função para permitir edição
                break;
            default: // Se o cargo não for reconhecido
                System.out.println("Cargo inválido.");
        }
    }

    private static void exibirInformacoesBasicas(Funcionario funcionario) { // Função para exibir informações básicas
        System.out.println("Nome: " + funcionario.getNome()); // Exibe o nome do funcionário
        System.out.println("Cargo: " + funcionario.getCargo()); // Exibe o cargo do funcionário
    }

    private static void exibirInformacoesVendas() { // Função para exibir informações de vendas
        System.out.println("Informações de vendas disponíveis.");
    }

    private static void exibirInformacoesFinanceiras() { // Função para exibir informações financeiras
        System.out.println("Informações financeiras disponíveis.");
    }

    private static void permitirEdicao() { // Função para permitir edição
        System.out.println("Permissões de edição disponíveis.");
    }

    public static void main(String[] args) { // Método principal (main) para testar o código
        Funcionario funcionario1 = new Funcionario("A", "Estagiario"); // Cria um funcionário Estagiário
        Funcionario funcionario2 = new Funcionario("B", "Funcionario"); // Cria um funcionário Funcionário
        Funcionario funcionario3 = new Funcionario("C", "Gerente"); // Cria um funcionário Gerente

        System.out.println("Permissões do Funcionário 1:");
        PermissoesFuncionario.gerenciarPermissoes(funcionario1); // Chama a função para gerenciar permissões do funcionário 1

        System.out.println("\nPermissões do Funcionário 2:");
        PermissoesFuncionario.gerenciarPermissoes(funcionario2); // Chama a função para gerenciar permissões do funcionário 2

        System.out.println("\nPermissões do Funcionário 3:");
        PermissoesFuncionario.gerenciarPermissoes(funcionario3); // Chama a função para gerenciar permissões do funcionário 3
    }
}
//fim da classe PermissoesFuncionario
