package com.adobe.epubcheck.tool;

public class GeneratedTestLocale {

    @Test
    public void testLocale() {
        String[] args = {"--locale", "en"};
        Locale locale = new EpubCheckerImpl().getLocale();
        assertEquals("en", locale);
    }

}