import com.taqueria.taqueriaapp.CalculadoraVenta;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraVentaTest {

    @Test
    public void testCalcularTotal() {
        double resultado = CalculadoraVenta.calcularTotal(25, 4);
        assertEquals(100, resultado, 0.01);
    }
}