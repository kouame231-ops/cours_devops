import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class CalendrierTest {

    private Calendrier cal;

    @Before
    public void setUp() {
        cal = new Calendrier();
    }

    @Test
    public void testBissextileNormale() {
        assertTrue(cal.estAnneeBissextile(2024));
    }

    @Test
    public void testNonBissextile() {
        assertFalse(cal.estAnneeBissextile(2023));
    }

    @Test
    public void testDivisiblePar100NonBissextile() {
        assertFalse(cal.estAnneeBissextile(1900)); // règle des 100
    }

    @Test
    public void testDivisiblePar400Bissextile() {
        assertTrue(cal.estAnneeBissextile(2000)); // règle des 400
    }

    @Test
    public void testAnnee1800NonBissextile() {
        assertFalse(cal.estAnneeBissextile(1800));
    }

    @Test
    public void testAnnee2100NonBissextile() {
        assertFalse(cal.estAnneeBissextile(2100));
    }
}
