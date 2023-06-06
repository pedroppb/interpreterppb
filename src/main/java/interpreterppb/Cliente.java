package interpreterppb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cliente {

    private List<Double> recargas = new ArrayList<>();

    public Cliente(Double... recargas) {
        this.recargas = Arrays.asList(recargas);
    }
    public double calcularFidelidade() {
        return Operadora.calcularFidelidade(new ArrayList<>(this.recargas));
    }

}

