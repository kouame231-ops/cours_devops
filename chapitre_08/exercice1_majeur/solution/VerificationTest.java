import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class VerificationTest {

    private Verification verif;

    @Before
    public void setUp() {
        verif = new Verification();
    }

    @Test
    public void testMajeurAge25() {
        assertTrue(verif.estMajeur(25));
    }

    @Test
    public void testMajeurAge18() {
        assertTrue(verif.estMajeur(18)); // valeur limite
    }

    @Test
    public void testMineurAge17() {
        assertFalse(verif.estMajeur(17));
    }

    @Test
    public void testMineurAge0() {
        assertFalse(verif.estMajeur(0));
    }

    @Test
    public void testAgeNegatif() {
        assertFalse(verif.estMajeur(-5));
    }

    @Test
    public void testMajeurAge100() {
        assertTrue(verif.estMajeur(100));
    }
}
