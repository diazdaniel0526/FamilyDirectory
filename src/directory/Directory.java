package directory;

import familyDirectory.view.ContactInfoRequest;
import familyDirectory.view.DirectoryMenuView;
import java.io.IOException;

public class Directory {
    public static void main (String[] args) throws Exception {
        // call directory menuview - directorymenueview and getInput functions
        DirectoryMenuView getMenu = new DirectoryMenuView();
        getMenu.directoryMenuView();

        DirectoryMenuView getSelection = new DirectoryMenuView();
        getSelection.getInput();

//        ContactInfoRequest createCont = new ContactInfoRequest();
//        createCont.createContacts();
//
//        ContactInfoRequest saveCont = new ContactInfoRequest();
//        saveCont.saveContacts();

    }
}