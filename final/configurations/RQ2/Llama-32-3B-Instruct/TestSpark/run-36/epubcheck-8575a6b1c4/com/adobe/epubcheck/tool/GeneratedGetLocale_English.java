package com.adobe.epubcheck.tool;

public class GeneratedGetLocale_English {

    public static Locale getLocale() {
        return new Locale("en", "US");
    }

    public static int run(String[] args) {
        // implementation
        return 0;
    }

    public static int processEpubFile(String file, String user, String password, String host) {
        // implementation
        return 0;
    }

    public static int validateFile(String path, EPUBVersion version, Report report, String... args) {
        // implementation
        return 0;
    }
}

public class EPUBVersion {
    // fields and methods
}

public class Report {
    // fields and methods
}

public class LocaleTest {

    @Test
    public void getLocale_English() {
        Locale locale = EpubChecker instance().getLocale();
        assertEquals(new Locale("en", "US"), locale, 0.0);
    }

}