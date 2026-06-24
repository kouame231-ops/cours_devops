import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class NoteScolaireTest {

    private NoteScolaire note;

    @Before
    public void setUp() {
        note = new NoteScolaire();
    }

    @Test
    public void testExcellent() {
        assertEquals("Excellent", note.calculerNote(18));
    }

    @Test
    public void testExcellentLimite() {
        assertEquals("Excellent", note.calculerNote(16)); // limite
    }

    @Test
    public void testBien() {
        assertEquals("Bien", note.calculerNote(15));
    }

    @Test
    public void testBienLimite() {
        assertEquals("Bien", note.calculerNote(14)); // limite
    }

    @Test
    public void testAssezBien() {
        assertEquals("Assez Bien", note.calculerNote(13));
    }

    @Test
    public void testAssezBienLimite() {
        assertEquals("Assez Bien", note.calculerNote(12)); // limite
    }

    @Test
    public void testPassable() {
        assertEquals("Passable", note.calculerNote(11));
    }

    @Test
    public void testPassableLimite() {
        assertEquals("Passable", note.calculerNote(10)); // limite
    }

    @Test
    public void testInsuffisant() {
        assertEquals("Insuffisant", note.calculerNote(8));
    }

    @Test
    public void testInsuffisantZero() {
        assertEquals("Insuffisant", note.calculerNote(0));
    }
}
