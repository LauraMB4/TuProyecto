package sumador;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestASumar {

    /**
     * Test para una cifra de un dígito.
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

}
