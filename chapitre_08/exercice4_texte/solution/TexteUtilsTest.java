import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class TexteUtilsTest {

    private TexteUtils texte;

    @Before
    public void setUp() {
        texte = new TexteUtils();
    }

    @Test
    public void testPhraseNormale() {
        assertEquals(4, texte.compterMots("Bonjour tout le monde"));
    }

    @Test
    public void testUnSeulMot() {
        assertEquals(1, texte.compterMots("Bonjour"));
    }

    @Test
    public void testPhraseVide() {
        assertEquals(0, texte.compterMots(""));
    }

    @Test
    public void testNull() {
        assertEquals(0, texte.compterMots(null));
    }

    @Test
    public void testEspacesMultiples() {
        assertEquals(3, texte.compterMots("un   deux   trois"));
    }

    @Test
    public void testEspacesAvantApres() {
        assertEquals(2, texte.compterMots("  bonjour monde  "));
    }
}
