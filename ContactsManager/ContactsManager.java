public class ContactsManager {
    // Attributs
    Contact[] myFriends;
    int friendsCount;

    // Constructeur par défaut
    public ContactsManager() {
        this.friendsCount = 0;
        this.myFriends = new Contact[500];
    }

    // Méthode pour ajouter un contact
    void addContact(Contact contact) {
        myFriends[friendsCount] = contact;
        friendsCount++;
    }

    // Méthode pour rechercher un contact par nom
    Contact searchContact(String searchName) {
        for (int i = 0; i < friendsCount; i++) {
            if (myFriends[i].name.equals(searchName)) {
                return myFriends[i];
            }
        }
        return null;
    }

    // NOUVELLE MÉTHODE : affiche tous les contacts
    void afficherTousLesContacts() {
        if (friendsCount == 0) {
            System.out.println("Aucun contact enregistré.");
            return;
        }
        for (int i = 0; i < friendsCount; i++) {
            System.out.println("Contact trouvé : " + myFriends[i].name + " -> " + myFriends[i].phoneNumber);
        }
    }
}