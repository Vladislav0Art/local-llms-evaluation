package com.adobe.epubcheck.tool;

public class GeneratedGetLocale_SimpleTest {

    @Test
    public void getLocale_SimpleTest() {
        EpubChecker instance = new EpubChecker();
        Locale locale = instance.getLocale();
        assertNotNull(locale);
    }

}