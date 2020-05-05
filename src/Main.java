public class Main {

    public static void main(String[] args) {

        // create the ContactsManager object
        ContactsManager myContactManager = new ContactsManager();

        // create new Contact object for James
        Contact friendJames = new Contact();

        // set the fields
        friendJames.name = "James";
        friendJames.phoneNumber = "00233345212";

        // add James Contact to the ContactsManager
        myContactManager.addContact(friendJames);

        // create new Contact Ana
        Contact friendAna = new Contact();

        //set fields
        friendAna.name = "Ana";
        friendAna.phoneNumber = "00783546223";

        // add Ana Contact to the ContactsManager
        myContactManager.addContact(friendAna);


        // search of a contact and display phone number
        Contact result = myContactManager.searchContact("Ana");
        System.out.println(result.phoneNumber);
    }


}
