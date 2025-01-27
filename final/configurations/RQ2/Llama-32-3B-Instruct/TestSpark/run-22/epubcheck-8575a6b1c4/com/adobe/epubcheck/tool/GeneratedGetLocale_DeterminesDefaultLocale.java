package com.adobe.epubcheck.tool;

public class GeneratedGetLocale_DeterminesDefaultLocale {

    public static int run(String[] args) {
        // implementation
        return 0;
    }

    public static int validate(String epubFile, String epbVersion, Report report, EPUBProfile profile) {
        // implementation
        return 1;
    }

    public static Locale locale() {
        return Locale.getDefault();
    }
}

public class TestEpubChecker {

    @Test
    public void getLocale_DeterminesDefaultLocale() {
        Locale defaultLocale = EpubChecker.locale();
        assertEquals(Locale.getDefault(), defaultLocale);
    }

}