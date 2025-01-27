package com.adobe.epubcheck.tool;

public class GeneratedTestGetLocale {

    @Test
    public void testGetLocale() {
        Locale locale = EpubChecker(Locale.ROOT).getLocale();
        assertNotNull(locale);
    }

}