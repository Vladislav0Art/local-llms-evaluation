package com.adobe.epubcheck.tool;

public class GeneratedTestGetLocale {

    @Test
    public void testGetLocale() {
        Locale locale = EpubChecker.getLocale();
        assertEquals(Locale.ENGLISH, locale);
    }

}