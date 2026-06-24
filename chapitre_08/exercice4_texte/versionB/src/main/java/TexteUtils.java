public class TexteUtils {
    public int compterMots(String phrase) {
        if (phrase == null || phrase.isEmpty()) return 0;
        return phrase.split(" ").length; // BUG : espaces multiples mal gérés
    }
}
