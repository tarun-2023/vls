package com.khushiagrawall.virtuallibrarysystem.operations;

import com.khushiagrawall.virtuallibrarysystem.models.Book;
import com.khushiagrawall.virtuallibrarysystem.models.TransactionLog;

import java.util.ArrayList;
import java.util.List;

public class BookStatisticsCalculator {


    public static int getTotalBooks(List<Book> books) {
        return books.size();
    }

    public static int getAvailableBooks(List<Book> books) {
        int count = 0;
        for (Book book : books) {
            if (book.getNoOfCopies() > 0) {
                count++;
            }
        }
        return count;
    }

    public static int getOutOfStockBooks(List<Book> books) {
        int count = 0;
        for (Book book : books) {
            if (book.getNoOfCopies() == 0) {
                count++;
            }
        }
        return count;
    }

    public static int getBorrowedBooks(List<TransactionLog> logs) {
        int count = 0;
        for (TransactionLog log : logs) {
            if (log.getReturned().equalsIgnoreCase("No")) {
                count++;
            }
        }
        return count;
    }

    public static void displayLibraryStatistics(List<Book> books,List<TransactionLog> log) {
        System.out.println("Library Statistics Overview:");
        System.out.println("Total Books: " + getTotalBooks(books));
        System.out.println("Available Books: " + getAvailableBooks(books));
        System.out.println("Borrowed Books: " + getBorrowedBooks(log));
        System.out.println("Out of Stock Books: " + getOutOfStockBooks(books));
    }

    public static int calculateCurrentlyBorrowedBooksCount(List<TransactionLog> logs) {
        int count = 0;
        for (TransactionLog logEntry : logs) {
            if (logEntry.getReturned().equalsIgnoreCase("No")) {
                count++;
            }
        }
        return count;
    }

    public static List<String> getAllBorrowedBookTitles(List<TransactionLog> logs,List<Book> books) {
        List<String> borrowedTitles = new ArrayList<>();
        boolean booksBorrowed = false;
        for (TransactionLog logEntry : logs) {
            if (logEntry.getReturned().equalsIgnoreCase("No")) {
                booksBorrowed = true;
                for (Book book :books) {
                    if (book.getISBN().equals(logEntry.getISBN())) {
                        borrowedTitles.add(book.getTitle());
                        break;
                    }
                }
            }
        }
        if (!booksBorrowed) {
            System.out.println("No books are currently borrowed.");
        }
        return borrowedTitles;
    }
}