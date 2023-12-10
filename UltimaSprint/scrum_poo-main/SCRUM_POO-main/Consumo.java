public class Consumo {
    private Associado associado;
    private double valor;

    public Consumo(Associado associado, double valor) {
        this.associado = associado;
        this.valor = valor;
    }

    public Associado getAssociado() {
        return associado;
    }

    public double getValor() {
        return valor;
    }
}
