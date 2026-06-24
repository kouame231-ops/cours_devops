public class Calendrier {
    public boolean estAnneeBissextile(int annee) {
        return annee % 4 == 0 && annee % 100 != 0; // BUG : oublie règle des 400
    }
}
