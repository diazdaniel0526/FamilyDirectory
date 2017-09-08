package familyDirectory.view;

import java.io.File;
import java.util.Scanner;

public class ContactDisplay {
    static Contact[] contacts = new Contact[2];

    public static void getContacts() throws Exception{
        File contactsFile = new File("contacts.data");
        Scanner contactScanner = new Scanner(contactsFile);
        for (int i = 0; i < 1; i++){
            String contactName = contactScanner.next();
            String contactLastName = contactScanner.next();
            String contactPhoneNum = contactScanner.next();
            String contactEmailAdd = contactScanner.next();
            String contactAddress = contactScanner.next();
            String contactDob = contactScanner.nextLine();

            Contact newContact = new Contact();
            newContact.name = contactName;
            newContact.lastName = contactLastName;
            newContact.phoneNum = contactPhoneNum;
            newContact.emailAdd = contactEmailAdd;
            newContact.address = contactAddress;
            newContact.dob = contactDob;

            contacts[i] = newContact;
        }
    }
    public static void displayContacts() throws Exception{
        for (int i = 0; i < 1; i++){
            Contact newContactAdded = contacts[i];
            System.out.printf("+----------------------------- +\n" +
                              "+      Contact Information     +\n" +
                              "+----------------------------- +\n" +
                              "  Name: %s %s\n" +
                              "  Phone #: %s\n" +
                              "  Email: %s\n" +
                              "  Address: %s\n" +
                              "  DBO:%s\n", newContactAdded.name, newContactAdded.lastName, newContactAdded.phoneNum,
                            newContactAdded.emailAdd, newContactAdded.address, newContactAdded.dob);
        }
    }
    public static void main(String[] args) throws Exception{
        getContacts();
        displayContacts();
    }
}
