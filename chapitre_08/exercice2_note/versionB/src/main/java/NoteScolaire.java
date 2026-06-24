public class NoteScolaire {
    public String calculerNote(double moyenne) {
        if (moyenne >= 16) return "Excellent";
        if (moyenne >= 14) return "Bien";
        if (moyenne >= 10) return "Assez Bien"; // BUG : 10 avant 12
        if (moyenne >= 12) return "Passable";   // jamais atteint
        return "Insuffisant";
    }
}
