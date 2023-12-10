import java.util.ArrayList;

class PainelAdministrativo { //inicio da classe PainelAdministrativo
    private ArrayList<Associado> associados; //cria um array de associados
    private ArrayList<AtividadeEsportiva> atividades; //cria um array de atividades

    public PainelAdministrativo() {  
        associados = new ArrayList<>();
        atividades = new ArrayList<>();
    }

    //para adicionar um novo associado
    public void adicionarAssociado(Associado associado) {
        associados.add(associado);
    }

    //mostra todos os cadastrados de associados
    public ArrayList<Associado> getAssociados() {
        return associados;
    }

    public void exibirDetalhesAssociados() { //inicio de exibirDetalhesAssociados
        for (Associado associado : associados) {//inicio do for para ver as informações do associado
            System.out.println("Nome: " + associado.getNome());
            System.out.println("Endereço: " + associado.getEndereco());
            System.out.println("Telefone: " + associado.getTelefone());
            System.out.println("Email: " + associado.getEmail());
            System.out.println("Pagamento Mensal: " + associado.getPagamentoMensal());
            System.out.println("Forma de Pagamento: " + associado.getFormaPagamento());

            System.out.println("Dependentes:"); 
            for (Dependente dependente : associado.getDependentes()) {//inicio do for para ver dependentes
                System.out.println("   Nome: " + dependente.getNome()); 
                System.out.println("   Idade: " + dependente.getIdade());
            }//fim do for 

            System.out.println("-----------------------");
        }//fim do for 
    }//inicio de exibirDetalhesAssociados

    //para encontrar associados pelo nome
            public Associado encontrarAssociadoPorNome(String nome) { 
                for (Associado associado : associados) {
                    if (associado.getNome().equalsIgnoreCase(nome)) {
                        return associado; //retorna o associado
                    }
                }
                return null; // Associado não encontrado
            }

    public Turma novaTurma(String diaSemana, String horarioInicio, String horarioTermino){
        Turma turma = new Turma(diaSemana, horarioInicio, horarioTermino);
        return turma; //retorna
    }

    public void cadastrarAtividade(AtividadeEsportiva atividade){
        atividades.add(atividade);
    }

    public ArrayList<AtividadeEsportiva> getAtividades(){
        return atividades;
    }

    public void mostrarAtividadesETurmas(){
        int auxCont = 1;
        for (AtividadeEsportiva at : atividades){
           System.out.println("Att " + auxCont + ": " + at.getNome() + " Faixa Etaria: " + at.getFaixaEtariaIndicada());
           System.out.println("Descrição: " + at.getDescricao());
           System.out.println("Nivel de habilidades: " + at.getNiveisHabilidade());
           for (Turma turmaObj: at.getTurmas()){
               System.out.println("Turmas: " + turmaObj.getDiaSemana() + " Inicio: " + turmaObj.getHorarioInicio() + " Fim: " + turmaObj.getHorarioTermino());
           }
           auxCont++;
           System.out.println("\n");
        }
    }

    public void mostrarAtividades(){
        int auxCont = 1;
        for (AtividadeEsportiva at : atividades){
           System.out.println("Att " + auxCont + ": " + at.getNome() + " Faixa Etaria: " + at.getFaixaEtariaIndicada());
           System.out.println("Descrição: " + at.getDescricao());
            System.out.println("Nivel de habilidades: " + at.getNiveisHabilidade());
           auxCont++;
           System.out.println("\n");
        }
    }

    public void cadastrarTurmaPorAtividade(Turma turma, AtividadeEsportiva atividade){
        atividade.adicionarTurma(turma);
    }

    public void cadastrarTurmaPorAtividade(Turma outraTurmaCadastro, Atividade outraAtividade) {
    }
} //fim da classe PainelAdministrativo
