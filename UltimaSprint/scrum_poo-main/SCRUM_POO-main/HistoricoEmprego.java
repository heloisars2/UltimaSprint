// Classe para representar um histórico de emprego
class HistoricoEmprego {
    private String empresa;
    private String cargo;
    private int anoInicio;
    private int anoFim;

    public HistoricoEmprego(String empresa, String cargo, int anoInicio, int anoFim) {
        this.empresa = empresa;
        this.cargo = cargo;
        this.anoInicio = anoInicio;
        this.anoFim = anoFim;
    }

    public HistoricoEmprego(int id, int funcionarioId, String empresa2, String cargo2, int anoInicio2, int anoFim2) {
    }

    // Método para formatar o histórico de emprego como uma string
    @Override
    public String toString() {
        return anoInicio + " - " + anoFim + ": " + empresa + " - " + cargo;
    }

    public int getFuncionarioId() {
        return 0;
    }

    public String getEmpresa() {
        return null;
    }

    public int getAnoInicio() {
        return 0;
    }

    public String getCargo() {
        return null;
    }
}