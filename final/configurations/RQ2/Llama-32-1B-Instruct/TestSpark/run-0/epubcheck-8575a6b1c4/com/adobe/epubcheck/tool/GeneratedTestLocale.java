package com.adobe.epubcheck.tool;

public class GeneratedTestLocale {

    @Test
    public void testLocale() {
        EpubChecker checker = new EpubChecker();
        Locale locale = checkergetLocale();
        assertEquals(Locale.US, locale);
    }

}