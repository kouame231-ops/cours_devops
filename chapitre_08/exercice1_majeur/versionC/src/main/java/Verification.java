public class Verification {
    /**
     * Retourne true si la personne est majeure (age >= 18)
     */
    public boolean estMajeur(int age) {
        if (age >= 18) {
            return false;  // BUG : logique inversée
        }
        return true;
    }
}
