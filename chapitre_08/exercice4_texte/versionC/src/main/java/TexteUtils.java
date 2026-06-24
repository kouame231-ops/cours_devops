public class TexteUtils {
    public int compterMots(String phrase) {
        if (phrase == null) return 0;
        return phrase.trim().split("\\s+").length; // BUG : "" retourne 1 au lieu de 0
    }
}
