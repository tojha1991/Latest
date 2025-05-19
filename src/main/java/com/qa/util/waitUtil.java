package com.qa.util;

public class waitUtil {

	public static void waitForSeconds(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Best practice
            System.out.println("Interrupted while sleeping: " + e.getMessage());
        }
    }
}
