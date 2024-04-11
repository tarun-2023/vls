package com.khushiagrawall.virtuallibrarysystem.commands;

import com.khushiagrawall.virtuallibrarysystem.models.Library;

public class ReturnBookCommand implements Command {
    @Override
    public void execute(Library lib) {
        lib.returnBook();
    }
}