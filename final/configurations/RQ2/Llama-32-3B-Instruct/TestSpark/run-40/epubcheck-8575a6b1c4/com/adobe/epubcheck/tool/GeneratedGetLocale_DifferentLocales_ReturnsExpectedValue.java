package com.adobe.epubcheck.tool;

public class GeneratedGetLocale_DifferentLocales_ReturnsExpectedValue {

    @Test
    public void getLocale_DifferentLocales_ReturnsExpectedValue() {
        Locale locale = EpubChecker.getInstance().getLocale();
        assertEquals(Locale.ENGLISH, locale);
        assertEquals(Locale.FRENCH, locale);
        assertEquals(Locale.SPANISH, locale);
    }

}