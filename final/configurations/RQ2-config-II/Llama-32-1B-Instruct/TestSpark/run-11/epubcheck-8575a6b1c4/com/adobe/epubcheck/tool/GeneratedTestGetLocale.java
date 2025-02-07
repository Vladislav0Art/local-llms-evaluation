package com.adobe.epubcheck.tool;

public class GeneratedTestGetLocale {

    @Test
    public void testGetLocale() {
        EpubChecker checker = new EpubChecker();
        Locale locale = checkergetLocale();
        assertEquals("en", locale.getLanguage());
    }

}