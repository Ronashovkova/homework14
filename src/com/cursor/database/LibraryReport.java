package com.cursor.database;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

public class LibraryReport implements Runnable {
    public static Map<LocalDate, String> dateToBookMap = new HashMap<>();

    public void put(LocalDate date, String bookTitle) {

        ReentrantLock lock = new ReentrantLock();
        lock.lock();
        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
        dateToBookMap.put(date, bookTitle);
        System.out.println("Next step " + dateToBookMap);
        lock.unlock();
    }

    public String getByDate(LocalDate date) {
        String bookByDate = dateToBookMap.get(date);
        if (bookByDate == null) {
            System.out.println("There are no books for this date.");
        } else {
            System.out.println("The book for this day is '" + bookByDate + "'");
        }
        return bookByDate;
    }

    public void showUsingDates() {
        System.out.println("Written dates in the Library report: ");
        System.out.println(dateToBookMap.keySet());
    }

    public void showUsingTitles() {
        System.out.println("Written book titles in the Library report: ");
        System.out.println(dateToBookMap.values());
    }

    @Override
    public void run() {
        showUsingTitles();
        showUsingDates();
        getByDate(LocalDate.of(2020, 4, 23));
    }
}
