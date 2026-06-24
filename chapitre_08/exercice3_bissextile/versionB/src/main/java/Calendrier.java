public class Calendrier {
    public boolean estAnneeBissextile(int annee) {
        return annee % 4 == 0; // BUG : ignore règle des 100 et 400
    }
}
