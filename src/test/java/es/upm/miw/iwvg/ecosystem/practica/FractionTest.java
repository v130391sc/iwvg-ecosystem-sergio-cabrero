package es.upm.miw.iwvg.ecosystem.practica;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FractionTest {
    Fraction fraction;

    @BeforeEach
    void before() {
        fraction = new Fraction(4, 2);
    }

    @Test
    void testFractionIntInt() {
        assertEquals(4, fraction.getNumerator());
        assertEquals(2, fraction.getDenominator());
    }

    @Test
    void testPoint() {
        fraction = new Fraction();
        assertEquals(1, fraction.getNumerator());
        assertEquals(1, fraction.getDenominator());
    }

    @Test
    void testDecimal(){
        fraction = new Fraction(3,2);
        assertEquals(1.5, fraction.decimal());
    }

    @Test
    void testIsHigher(){
        Fraction fractionAux = new Fraction(5,2);
        assertEquals(false, fraction.isHigher(fractionAux));
    }

}
