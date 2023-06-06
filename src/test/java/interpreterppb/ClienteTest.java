package interpreterppb;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class ClienteTest {
    @Test
    void deveRetornarValorFidelidadeComRecarga() {
        Cliente cliente = new Cliente(15.0,10.0,50.0,15.0);
        assertEquals(103.5, cliente.calcularFidelidade());
    }
    @Test
    void deveRetornarValorFidelidadeSemRecarga() {
        Cliente cliente = new Cliente();
        assertEquals(0, cliente.calcularFidelidade());
    }
}
