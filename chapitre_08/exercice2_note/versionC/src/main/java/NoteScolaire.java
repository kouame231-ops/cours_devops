public class NoteScolaire {
    public String calculerNote(double moyenne) {
        if (moyenne > 16) return "Excellent";  // BUG : > au lieu de >=
        if (moyenne > 14) return "Bien";
        if (moyenne > 12) return "Assez Bien";
        if (moyenne > 10) return "Passable";
        return "Insuffisant";
    }
}
