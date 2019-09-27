package es.upm.miw.iwvg.ecosystem.practica;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FractionTest {
    Fraction fraction;

    Fraction fractionAux;

    @BeforeEach
    void before() {
        fraction = new Fraction(4, 2);
        fractionAux = new Fraction(5,2);
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
        assertEquals(false, fraction.isHigher(fractionAux));
    }

    @Test
    void testMultiplication(){
        Fraction result = fraction.multiplication(fractionAux);
        assertEquals(20, result.getNumerator());
        assertEquals(4, result.getDenominator());
    }

}
