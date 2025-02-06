package com.adobe.epubcheck.tool;

public class GeneratedGetLocale localeWithCustomLocale {

    private EpubChecker underTest = new EpubChecker();

    @Test
    public void getLocale

    localeWithCustomLocale() {
        underTest.setLocale(Locale.FRENCH);
        Locale locale = underTest.Locale();
        assertNotNull(locale);
        assertEquals(Locale.FRENCH, locale);
    }

}