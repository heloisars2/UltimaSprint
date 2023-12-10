import java.util.ArrayList;
import java.util.List;

public class Lanchonete {
    private List<Consumo> consumos;

    public Lanchonete() {
        consumos = new ArrayList<>();
    }

    public void registrarConsumo(Associado associado, double valor) {
        Consumo novoConsumo = new Consumo(associado, valor);
        consumos.add(novoConsumo);
    }

    public List<Consumo> getConsumos() {
        return consumos;
    }
}
