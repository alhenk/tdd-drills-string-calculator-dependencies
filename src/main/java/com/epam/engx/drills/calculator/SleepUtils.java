package com.epam.engx.drills.calculator;

/**
 * @author Nurmakanov
 */
public final class SleepUtils {

    private SleepUtils() {}

    static void sleep(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
