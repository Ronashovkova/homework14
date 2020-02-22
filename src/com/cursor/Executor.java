package com.cursor;

import com.cursor.database.LibraryReport;

import java.time.LocalDate;

public class Executor {
    public static void start() {
        LibraryReport libraryReport = new LibraryReport();

        libraryReport.put(LocalDate.of(2020, 4, 23), "The Idiot");
        libraryReport.put(LocalDate.of(2020, 2, 5), "The Lord of the Rings");
        libraryReport.put(LocalDate.of(2020, 3, 1), "The Artist's Way");
        libraryReport.put(LocalDate.of(2020, 4, 22), "The Name of the Rose");


        Thread readThread = new Thread(new LibraryReport());
        readThread.start();
    }
}
