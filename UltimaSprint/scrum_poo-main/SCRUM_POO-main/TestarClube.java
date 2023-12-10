import java.io.PrintStream;
import java.util.List;

public class TestarClube {
    public static void main(String[] args) {

        System.out.println("Testando o painel para cadastro de associados:\n");

        // Criando um objeto PainelAdministrativo
        PainelAdministrativo painel = new PainelAdministrativo(); 

        // Adicionando novos associados
        Associado associado1 = new Associado("João", 0, "Rua A", "123456789", "joao@example.com", 100.0, "Cartão");
        associado1.adicionarDependente("Maria", 12);
        associado1.adicionarDependente("Pedro", 8);

        Associado associado2 = new Associado("Ana", 0, "Rua B", "987654321", "ana@example.com", 150.0, "Boleto");
        associado2.adicionarDependente("Luiz", 10);

        // Adicionando os associados ao painel administrativo
        painel.adicionarAssociado(associado1);
        painel.adicionarAssociado(associado2);

        // Exibindo os detalhes dos associados cadastradosn
        painel.exibirDetalhesAssociados();

        //vamos agora criar novas atividades começando por turmas
        System.out.println("\n\nTestando a classe Turmas e Atividades:\n");

        Turma turma = painel.novaTurma("Terça-Feira", "15:00", "16:30");
        Atividade atividade = new Atividade("Natação", "Natação com professore especializados","10-18");

        atividade.adicionarNivelHabilidade("Sem nivel especifico");

        Turma outraTurma = new Turma("Quarta-Feira", "14:00", "15:30");
        Turma outraTurma2 = new Turma("Sexta-Feira", "16:00", "17:30");

        // Criar outra instância de Atividade
        Atividade outraAtividade = new Atividade("Yoga","Yoga para relaxamento","18+");
        outraAtividade.adicionarNivelHabilidade("Habilidades basicas em flexibilidade");

       //cadastra a nova atividade

        painel.cadastrarAtividade(atividade);
        painel.cadastrarAtividade(outraAtividade);

        Turma outraTurmaCadastro = new Turma("Segunda-Feira", "21:00", "22:30");

        //por atividade cadastra uma turma passando a atividade e a turma nova

        painel.cadastrarTurmaPorAtividade(outraTurmaCadastro, outraAtividade);
        painel.cadastrarTurmaPorAtividade(outraTurma2, outraAtividade);
        painel.cadastrarTurmaPorAtividade(outraTurma, outraAtividade);
        painel.cadastrarTurmaPorAtividade(turma, atividade);

        //mostra todas as atividades
        System.out.println("Mostrando todas as atividades\n");
        painel.mostrarAtividades();

         //listando todas as atividades e suas respectivas turmas e horarios
        System.out.println("Mostrando todas as atividades e suas respectivas turmas e horarios\n");
        painel.mostrarAtividadesETurmas();

        Associado associado = new Associado("Nome do Associado", 0);

        // Supondo que as atividades sejam identificadas por uma string única
        // Registra algumas faltas para o associado em diferentes atividades
        associado.registrarFalta("Atividade 1");
        associado.registrarFalta("Atividade 2");
        associado.registrarFalta("Atividade 1");

        // Exibe o número de faltas para o associado em atividades específicas
        System.out.println("O associado " + associado.getNome() + " tem " + associado.getFaltas("Atividade 1") + " faltas na Atividade 1.");
        System.out.println("O associado " + associado.getNome() + " tem " + associado.getFaltas("Atividade 2") + " faltas na Atividade 2.");
    }
        // Adicionar atividades esportivas
    private Object clube;
        clube.adicionarAtividade(new AtividadeEsportiva("Yoga", "Segunda-feira, 18:00", "Prática de yoga para relaxamento", "Instrutor A", "Iniciante"))
        clube.adicionarAtividade(new AtividadeEsportiva("Musculação", "Terça-feira, 16:00", "Treino de musculação", "Instrutor B", "Avançado"))
        clube.adicionarAtividade(new AtividadeEsportiva("Natação", "Quarta-feira, 10:00", "Aulas de natação", "Instrutor C", "Intermediário"))

        // Listar atividades para o associado
        List<AtividadeEsportiva> atividades = ((Object) clube).listarAtividades();
        for (AtividadeEsportiva atividade : atividades) {
            System.out.println(atividade);
            System.out.println();
        }
         //Testando a classe Consumo
        // Criando alguns associados
        Associado associado1 = new Associado("João", 1);
        Associado associado2 = new Associado("Maria", 2);
   
        // Criando a lanchonete
        Lanchonete lanchonete = new Lanchonete();
   
        // Registrando consumos
        Lanchonete.registrarConsumo(Associado1, 10.50);
        Lanchonete.registrarConsumo(Associado2, 8.75);
   
        // Obtendo a lista de consumos
        List<Consumo> consumos = lanchonete.getConsumos();
   
        // Exibindo os consumos
        for (Consumo consumo : consumos) {
            PrintStream out = System.out;
            out.println("Associado: " + consumo.getAssociado().getNome() + ", Valor: " + consumo.getValor());
        }
}  


