public class Main {
    public static void main(String[] args) {
        ContactsManager myContactsManager = new ContactsManager();

        // Ajout de 5 contacts
        Contact c1 = new Contact("Kouame", "0512345678");
        myContactsManager.addContact(c1);
        Contact c2 = new Contact("Issa", "0723456789");
        myContactsManager.addContact(c2);
        Contact c3 = new Contact("Charle", "0134567890");
        myContactsManager.addContact(c3);
        Contact c4 = new Contact("Isaac", "0745678901");
        myContactsManager.addContact(c4);
        Contact c5 = new Contact("Maiga", "0556789012");
        myContactsManager.addContact(c5);

        // Afficher tous les contacts
        myContactsManager.afficherTousLesContacts();
    }
}