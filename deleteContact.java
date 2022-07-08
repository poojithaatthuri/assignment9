package assignment9;

public class deleteContact {

        public static void main(String[] args) {
            System.out.println("Welcome to Address Book System");
            addressBook addressBook = new addressBook();
            addressBook.addContact();
            addressBook.addContact();
            //UC2 add contacts
            for (Contacts contacts : addressBook.contactsArrayList) {
                System.out.println("The" + contacts);
            }
            //UC3 edit contacts
            addressBook.editContacts();
            System.out.println("After editing: ");
            System.out.println("*********************");
            for (Contacts contacts:addressBook.contactsArrayList) {
                System.out.println("the"+contacts);
            }
            System.out.println("*********************");
//
            //UC4 delete users
            addressBook.deleteContacts();
            for (Contacts contacts:addressBook.contactsArrayList) {
                System.out.println("the" + contacts);
            }
        }

}
