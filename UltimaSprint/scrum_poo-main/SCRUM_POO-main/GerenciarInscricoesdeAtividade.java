public class GerenciarInscricoesdeAtividade {
    public static void main(String[] args) {
        Atividade atividade1 = new Atividade("Atividade 1", 20);
        Atividade atividade2 = new Atividade("Atividade 2", 15);

        Associado associado1 = new Associado("Associado 1", 1, "Endereco1", "Telefone1", "Email1", 100.0, "Forma de Pagamento1");
        Associado associado2 = new Associado("Associado 2", 2, "Endereco2", "Telefone2", "Email2", 100.0, "Forma de Pagamento2");

        boolean sucesso1 = associado1.inscreverEmAtividade(atividade1);
        boolean sucesso2 = associado2.inscreverEmAtividade(atividade1);
        boolean sucesso3 = associado2.inscreverEmAtividade(atividade2);

        // Imprima mensagens para indicar se as inscrições foram bem-sucedidas
        if (sucesso1) {
            System.out.println("Associado 1 inscrito na Atividade 1 com sucesso.");
        } else {
            System.out.println("Não foi possível inscrever Associado 1 na Atividade 1 devido à capacidade total.");
        }

        if (sucesso2) {
            System.out.println("Associado 2 inscrito na Atividade 1 com sucesso.");
        } else {
            System.out.println("Não foi possível inscrever Associado 2 na Atividade 1 devido à capacidade total.");
        }

        if (sucesso3) {
            System.out.println("Associado 2 inscrito na Atividade 2 com sucesso.");
        } else {
            System.out.println("Não foi possível inscrever Associado 2 na Atividade 2 devido à capacidade total.");
        }
    }
}
