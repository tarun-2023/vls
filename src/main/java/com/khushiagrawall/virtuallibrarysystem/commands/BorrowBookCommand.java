package com.khushiagrawall.virtuallibrarysystem.commands;

import com.khushiagrawall.virtuallibrarysystem.models.Library;

public class BorrowBookCommand implements Command {
    @Override
    public void execute(Library lib) {
        lib.borrowBook();
    }
}
