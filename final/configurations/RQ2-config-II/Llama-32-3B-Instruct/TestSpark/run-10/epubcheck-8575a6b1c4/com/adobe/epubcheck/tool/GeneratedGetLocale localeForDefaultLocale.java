package com.adobe.epubcheck.tool;

public class GeneratedGetLocale localeForDefaultLocale {

    private EpubChecker underTest = new EpubChecker();

    @Test
    public void getLocale

    localeForDefaultLocale() {
        Locale locale = underTestgetLocale();
        assertNotNull(locale);
        assertEquals(Locale.ENGLISH, locale);
    }

}