# Exercice 3 — estAnneeBissextile(int annee)

## Objectif
Écrire les tests JUnit pour la méthode `estAnneeBissextile(int annee)`.

## Règle
Une année est bissextile si :
- divisible par 4
- SAUF si divisible par 100
- SAUF si divisible par 400 (dans ce cas elle EST bissextile)

## Exemples
| Année | Bissextile ? | Raison              |
|-------|-------------|---------------------|
| 2024  | ✅ oui      | divisible par 4     |
| 1900  | ❌ non      | divisible par 100   |
| 2000  | ✅ oui      | divisible par 400   |
| 2023  | ❌ non      | non divisible par 4 |

## Consigne
Créer `src/test/java/CalendrierTest.java` et tester les 4 cas ci-dessus.
