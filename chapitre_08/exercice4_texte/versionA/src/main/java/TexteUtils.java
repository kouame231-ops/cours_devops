public class TexteUtils {
    public int compterMots(String phrase) {
        if (phrase == null || phrase.trim().isEmpty()) return 0;
        return phrase.trim().split("\\s+").length;
    }
}
