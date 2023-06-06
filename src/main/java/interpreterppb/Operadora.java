package interpreterppb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Operadora {
    public static String formula = " * 115 / 100";
    public static double calcularFidelidade(List<Double> valores) {
        String expressao="0";
        if(!valores.isEmpty()){
            expressao= String.valueOf(valores.get(0).doubleValue());
            valores.remove(0);
            for (Double valor:valores) {
                expressao+=" + "+valor;
            }
        }
        expressao+=formula;
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas(expressao);
        return interpretador.interpretar();
        }
}
