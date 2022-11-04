package org.luisf.model;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class AlphaNumMain {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        AphaNumericHW task1 = new AphaNumericHW(Type.LETTER);
        AphaNumericHW task2 = new AphaNumericHW(Type.NUMBER);

        executor.submit(task1);
        executor.submit(task2);

        executor.shutdown();
        executor.awaitTermination(2, TimeUnit.SECONDS);
    }
}
