# Chapitre 08 — Tests Unitaires avec JUnit

## Objectif du chapitre
Apprendre à écrire des tests unitaires en Java avec JUnit 4.

## Exercices

| Exercice | Méthode testée | Concept clé |
|----------|---------------|-------------|
| [Exercice 1](exercice1_majeur/) | `estMajeur(int age)` | assertTrue / assertFalse |
| [Exercice 2](exercice2_note/) | `calculerNote(double moyenne)` | assertEquals / valeurs limites |
| [Exercice 3](exercice3_bissextile/) | `estAnneeBissextile(int annee)` | Logique combinée |
| [Exercice 4](exercice4_texte/) | `compterMots(String phrase)` | Cas null / chaînes vides |

## Structure de chaque exercice
```
exerciceX/
  README.md         ← consigne et tableau des cas à tester
  versionA/         ← version CORRECTE (à utiliser pour les tests)
    pom.xml
    src/main/java/  ← classe fournie
    src/test/java/  ← DOSSIER VIDE : étudiant crée le fichier Test ici
  versionB/         ← version avec bug subtil
    src/main/java/
  versionC/         ← version avec bug évident
    src/main/java/
  solution/         ← correction (ne pas ouvrir avant d'essayer !)
```

## Comment utiliser
1. Ouvrir `versionA/` dans IntelliJ comme projet Maven
2. Lire le `README.md` de l'exercice
3. Créer le fichier `*Test.java` dans `src/test/java/`
4. Lancer les tests avec `mvn test` ou clic droit → Run
5. Copier le même fichier Test dans `versionB/` et `versionC/`
6. Observer quels tests échouent et pourquoi
