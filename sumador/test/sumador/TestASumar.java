package sumador;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TestASumar {

    /**
     * Test para una cifra.
     */
    @Test
    public void testUnaCifra() {
        ASumar sumi = new ASumar();
        String resultado = sumi.mostrar("5");
        assertEquals("5 = 5",resultado);
    }
    
    /**
     * Test para una cifra negativo.
     */
    @Test
    public void testNegativo() {
        ASumar sumi = new ASumar();
        String resultado = sumi.mostrar("-5");
        assertEquals("",resultado );
    }

    /**
     * Test varias cifras.
     */
    @Test
    public void testVariasCifras() {
        ASumar sumi = new ASumar();
        String resultado = sumi.mostrar("3433");
        assertEquals("3433 = 13",resultado);
    }
}
