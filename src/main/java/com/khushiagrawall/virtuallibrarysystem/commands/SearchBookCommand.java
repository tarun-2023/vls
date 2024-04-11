package com.khushiagrawall.virtuallibrarysystem.commands;

import com.khushiagrawall.virtuallibrarysystem.models.Library;

public class SearchBookCommand implements Command {
    @Override
    public void execute(Library lib) {
        lib.searchBook();
    }
}
