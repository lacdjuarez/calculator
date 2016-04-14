/**
 * Created by usuario on 13/04/2016.
 */
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.add(10, 50);
        assertEquals(60, result, 0);
    }
}
