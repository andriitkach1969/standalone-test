package com.selenide.test.utils;

public class TimeUtils {
    /**
     * param timeoutSeconds timeout in seconds for sleep
     */
    public static void sleepInSeconds(int timeoutSeconds) {
        try {
            Thread.sleep(timeoutSeconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
