package com.adobe.epubcheck.tool;

public class GeneratedLocaleOnlyTest {

    @Test
    public void localeOnlyTest() {
        Locale locale = new Locale("en", "US");
        EpubChecker instance = new EpubChecker();
        assertEquals(locale, instance.getLocale());
    }

}