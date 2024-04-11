package com.khushiagrawall.virtuallibrarysystem.commands;

import com.khushiagrawall.virtuallibrarysystem.models.Library;

public class AnalyzersCommand implements Command{
    @Override
    public void execute(Library lib){
        lib.analyzer();
    }
}
