package com.khushiagrawall.virtuallibrarysystem;

import com.khushiagrawall.virtuallibrarysystem.models.Library;
import com.khushiagrawall.virtuallibrarysystem.utlis.ScannerUtils;
import com.khushiagrawall.virtuallibrarysystem.commands.*;

import java.util.HashMap;
import java.util.Map;

public class VirtualLibrarySystem {
    public static void main(String[] args) {
        VirtualLibrarySystem virtualLibrarySystem = new VirtualLibrarySystem();
        virtualLibrarySystem.displayWelcomeMessage();
        virtualLibrarySystem.run();
    }

    public void run() {
        LibraryCommands libraryCommands = new LibraryCommands();
        Library lib = new Library();

        int choice;

        while (true) {
            showMainMenu();
            choice = ScannerUtils.getIntInput("Choose an option: ");

            if (choice == 9) {
                displayExitMessage();
                break;
            }

            Command command = libraryCommands.getCommand(choice);
            if(command == null) {
                System.out.println("Invalid Choice");
            }
            command.execute(lib);
        }
    }

    private void displayWelcomeMessage() {
        System.out.println("📕📗📘📙📔📕📗📘📙📔📕📗📘📙📔📕📗📘📙📔📕📗📘📙📔📕📗📘📙📔");
        System.out.println("📚          Virtual Library Management System (VLS)        📚");
    }

    private void showMainMenu() {
        System.out.println("📕📗📘📙📔📕📗📘📙📔📕📗📘📙📔📕📗📘📙📔📕📗📘📙📔📕📗📘📙📔📕📗📘");
        displayMainMenuOptions();
        System.out.println("------------------------------------------------------------------");
    }

    private void displayMainMenuOptions() {
        System.out.println("1. Search for a book            \t2. 🚚 Borrow a book");
        System.out.println("3. Return a book                \t4. 📫 View Library Inventory");
        System.out.println("5. 💾 View Transaction Log      \t6. 👆 Upload Books");
        System.out.println("7. Books Statistics Overview    \t8. Analyzers");
        System.out.println("9. Exit");
    }

    private void displayExitMessage() {
        System.out.println("📕📗📘📙📔📕📗📘📙📔📕📗📘📙📔📕📗📘📙📔📕📗📘📙📔");
        System.out.println("📔\tThank You for visitng. Come Back Soon  📕");
        System.out.println("📕📗📘📙📔📕📗📘📙📔📕📗📘📙📔📕📗📘📙📔📕📗📘📙📔");
    }
}
