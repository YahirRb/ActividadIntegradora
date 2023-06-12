package NumerosEntreRango;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Yahir
 */
public class NumerosEntreRangoTest {
    
    public NumerosEntreRangoTest() {
    }

    @Test
    public void testObtenerNumerosEntreRango() {
       System.out.println("Prueba 1");
        int numero1=1;
        int numero2 =10;
        List<Integer> expected1 = Arrays.asList(2,4,6,8);
        List<Integer> actual = NumerosEntreRango.obtenerNumerosEntreRango(numero1, numero2);
        assertEquals(expected1, actual);
    }
}
