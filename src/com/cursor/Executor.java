package com.cursor;

import com.cursor.models.Request;
import com.cursor.models.WebServer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executor {
    public static void start() {

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.submit(new WebServer(new Request("GET", "123@gmail.com")));

        ExecutorService secondExecutorService = Executors.newSingleThreadExecutor();
        secondExecutorService.submit(new WebServer(new Request("POST", "345@gmail.com")));

        ExecutorService thirdExecutorService = Executors.newSingleThreadExecutor();
        thirdExecutorService.submit(new WebServer(new Request("HEAD", "456@gmail.com")));

        ExecutorService fourthExecutorService = Executors.newSingleThreadExecutor();
        fourthExecutorService.submit(new WebServer(new Request("PUT", "987@gmail.com")));

        ExecutorService fifthExecutorService = Executors.newSingleThreadExecutor();
        fifthExecutorService.submit(new WebServer(new Request("DELETE", "567@gmail.com")));
    }
}
