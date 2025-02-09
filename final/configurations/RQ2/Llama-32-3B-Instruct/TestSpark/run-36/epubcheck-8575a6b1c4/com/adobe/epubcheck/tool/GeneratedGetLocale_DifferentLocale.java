package com.adobe.epubcheck.tool;

public class GeneratedGetLocale_DifferentLocale {

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
    public void getLocale_DifferentLocale() {
        Locale locale = EpubChecker instance().getLocale();
        assertEquals(locale, new Locale("es", "ES"), 0.0);
    }
}

}