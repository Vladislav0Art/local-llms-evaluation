package com.adobe.epubcheck.tool;

public class GeneratedGetLocale LocaleTest {

    private static final File tmpFile = File.createTempFile("epub-checker", ".tmp");

    @Test
    public void getLocale

    LocaleTest() {
        EpubChecker instance = new EpubChecker();
        Locale locale = instance.getLocale();
        assertNotNull(locale);
    }

}