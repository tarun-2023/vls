package com.khushiagrawall.virtuallibrarysystem;


import com.khushiagrawall.virtuallibrarysystem.commands.*;

import java.util.HashMap;
import java.util.Map;

public class LibraryCommands {
    private Map<LibraryOption, Command> commands;

    public LibraryCommands() {
        this.commands = new HashMap<>();
        this.load();
    }

    private void load() {
        commands.put(LibraryOption.SEARCH, new SearchBookCommand());
        commands.put(LibraryOption.BORROW, new BorrowBookCommand());
        commands.put(LibraryOption.RETURN, new ReturnBookCommand());
        commands.put(LibraryOption.INVENTORY, new BookInventoryCommand());
        commands.put(LibraryOption.LOGS, new ViewLogCommand());
        commands.put(LibraryOption.UPLOAD, new UploadBookCommand());
        // TODO: Can we merge analytics and trends
        commands.put(LibraryOption.ANALYTICS, new ShowStatisticsCommand());
        commands.put(LibraryOption.TRENDS, new AnalyzersCommand());
    }

    // TODO: Rename Command -> Option

    public Command getCommand(LibraryOption libraryOption) {
        return this.commands.get(LibraryOption.SEARCH);
    }

    public Command getCommand(Integer option) {
        return this.getCommand(LibraryOption.SEARCH);
    }
}
