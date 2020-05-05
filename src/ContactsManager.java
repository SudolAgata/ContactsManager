public class ContactsManager {

    // array: one field will be array of contacts, another will have the number of friends added to the list
    // fields:
    Contact [] myFriends;
    int friendsCount;

    // constructor:
    ContactsManager(){
        this.friendsCount = 0;
        this.myFriends = new Contact[500];
    }

    // methods:
    void addContact(Contact contact){
        myFriends[friendsCount] = contact;
        friendsCount++;
    }

    Contact searchContact(String searchName){
        for(int i=0; i<friendsCount; i++){
            if(myFriends[i].name.equals(searchName)){
            return myFriends[i];
            }
        }
        return null;
    }
}
