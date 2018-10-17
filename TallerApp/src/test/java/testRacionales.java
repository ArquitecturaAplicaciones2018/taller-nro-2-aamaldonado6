import ec.edu.utpl.TallerApp.Racionales.Rational;
import org.junit.Test;
import static org.junit.Assert.*;

public class testRacionales {

    @Test (expected = IllegalArgumentException.class)
    public void denominadorTest() {
        Rational r = new Rational(3,0);
    }

    @Test
    public void toStringTest() {
        Rational r = new Rational(1,2);
        assertEquals("se espera","1/2", r.toString());

    }

    Rational n1 = new Rational(2,2);
    Rational n2 = new Rational(5,4);

    @Test
    public void isLessThanTest() {

        assertEquals(true,n1.isLessThan(n2));

    }

    @Test
    public void getGreaterTest() {
        assertEquals(n2,n1.getGreater(n2));
    }

    @Test
    public void plusTest() {
        assertEquals(9,n1.plus(n2).getNumerator());
        assertEquals(4,n1.plus(n2).getDenominator());
    }

    @Test
    public void minusTest() {
        assertEquals("1/-4",n1.minus(n2).toString());
    }

    @Test
    public void timesTest() {
        assertEquals(5,n1.times(n2).getNumerator());
        assertEquals(4,n1.times(n2).getDenominator());
    }

    @Test
    public void divides() {
        assertEquals(4,n1.divides(n2).getNumerator());
        assertEquals(5,n1.divides(n2).getDenominator());
    }
}
