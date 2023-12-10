class Turma {
    private String diaSemana;
    private String horarioInicio;
    private String horarioTermino;

    public Turma(String diaSemana, String horarioInicio, String horarioTermino) {
        this.diaSemana = diaSemana;
        this.horarioInicio = horarioInicio;
        this.horarioTermino = horarioTermino;
    }

    // Getter e Setter para diaSemana
    public String getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    // Getter e Setter para horarioInicio
    public String getHorarioInicio() {
        return horarioInicio;
    }

    public void setHorarioInicio(String horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    // Getter e Setter para horarioTermino
    public String getHorarioTermino() {
        return horarioTermino;
    }

    public void setHorarioTermino(String horarioTermino) {
        this.horarioTermino = horarioTermino;
    }
}
