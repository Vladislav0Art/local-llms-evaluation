package com.adobe.epubcheck.tool;

public class GeneratedGetLocale_englishLocale_ReturnsLocale {

    @Test
    public void getLocale_englishLocale_ReturnsLocale() {
        Locale locale = EpubCheckerTest.getLocale();
        assertEquals(Locale.ENGLISH, locale);
    }

}