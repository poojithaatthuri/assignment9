package assignment9;

public class addressBookmain {
    private Contacts[] contactsArrayList;

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book System");
        addressBookmain addressBook = new addressBookmain();
        addressBook.addContact();
        addressBook.addContact();
        //UC2 add contacts
        for (Contacts contacts : addressBook.contactsArrayList) {
            System.out.println("The" + contacts);
        }
    }

    private void addContact() {
        
    }
}
