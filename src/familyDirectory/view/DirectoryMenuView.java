package familyDirectory.view;

import java.util.Scanner;

public class DirectoryMenuView {
    public static void directoryMenuView() {
        System.out.println("\n");
        System.out.println("*-------------------------------*");
        System.out.println("*        Directory Menu         *");
        System.out.println("*-------------------------------*");
        System.out.println("*  N – Create New Contact       *");
        System.out.println("*  D - Display Current Contacts *");
        System.out.println("*  S - Search Contacts          *");
        System.out.println("*  Q – Quit                     *");
        System.out.println("*-------------------------------*");
    }

    public boolean getInput() throws  Exception{
        Scanner keyboard = new Scanner(System.in);
        System.out.println("\nEnter your selection: ");
        String value = keyboard.next();
            if (value.length() < 1)
                System.out.println("\nInvalid selection, selection should be one letter");
        char selection = value.charAt(0);

        switch (selection) {
            case 'N' :
                this.createNewContact();
                break;
            case 'D' :
                this.displayContacts();
                break;
            case 'S' :
                this.searchContacts();
                break;
            case 'Q' :
                return false;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                this.getInput();
        }
        return true;
    }

    private void createNewContact() throws Exception {
        ContactInfoRequest.createContacts();
        ContactInfoRequest.saveContacts();
;
        this.directoryMenuView();
        this.getInput();
    }

    private void displayContacts() throws Exception {
        ContactDisplay.getContacts();
        ContactDisplay.displayContacts();

        this.directoryMenuView();
        this.getInput();
    }

    private void searchContacts() throws Exception{

        this.directoryMenuView();
        this.getInput();
    }

}
