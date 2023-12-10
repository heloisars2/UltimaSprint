class Feedback {
    private String comentario;

    public Feedback(String comentario) {
        this.comentario = comentario;
    }

    public Feedback(int id, int funcionarioId, String feedbackTexto) {
    }

    // Método para formatar o feedback como uma string
    @Override
    public String toString() {
        return comentario;
    }

    public int getFuncionarioId() {
        return 0;
    }

    public String getFeedbackTexto() {
        return null;
    }
}