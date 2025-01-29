package com.adobe.epubcheck.tool;

public class GeneratedTestGetLocale {

    @Test
    public void testGetLocale() {
        Locale locale = new Locale("en", "US");
        assertEquals("en-US", EpubChecker.class.getMethod("getLocale").invoke(locale).toString());
    }

}