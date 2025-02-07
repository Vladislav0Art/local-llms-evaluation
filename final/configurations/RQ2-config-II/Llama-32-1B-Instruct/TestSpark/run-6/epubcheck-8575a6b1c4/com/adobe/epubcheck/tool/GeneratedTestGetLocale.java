package com.adobe.epubcheck.tool;

public class GeneratedTestGetLocale {

    @Test
    public void testGetLocale() {
        EpubCheckerImpl instance = new EpubCheckerImpl();
        Locale locale = instance.getLocale();
        assertEquals("en", locale);
    }

}

class EpubCheckerImpl extends EpubChecker {

    private static final String LOCALE_PROPERTY_NAME = "locale";

    @Override
    public Locale getLocale() {
        return System.getProperty(LOCALE_PROPERTY_NAME, Locale.getDefault());
    }

}