package com.adobe.epubcheck.tool;

public class GeneratedGetLocale_NullString_ReturnsDefaultLocale {

    public static Locale getLocale() {
        return Locale.getDefault();
    }

    public static int run(String[] args) {
        // implement run logic
        return 0;
    }

    public static int validateFile(URI file, String epubVersion) {
        // implement validation logic
        return 0;
    }
}

public class EpubCheckerTest {

    @Test
    public void getLocale_NullString_ReturnsDefaultLocale() {
        Locale locale = EpubChecker.getLocale("test");
        assertNotNull(locale);
    }

}