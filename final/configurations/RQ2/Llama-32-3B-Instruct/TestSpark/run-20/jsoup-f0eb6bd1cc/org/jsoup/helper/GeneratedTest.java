package org.jsoup.helper;

public class GeneratedTest {

    private static final String SCHEME = "https";
    private static final int DEFAULT_PORT = 80;

    public static String toString(URL url) {
        return SCHEME + "://" + url.getHost() + ":" + url.getPort(DEFAULT_PORT);
    }

    public static void assertEquals(String expected, String actual) {
        if (!expected.equals(actual)) {
            throw new AssertionError("Expected: " + expected + ", Actual: " + actual);
        }
    }
}

public class TestURLUtil {

}