package com.adobe.epubcheck.tool;

public class GeneratedTestGetLocale {

    @Test
    public void testGetLocale() {
        EpubChecker checker = new EpubChecker();
        String locale = (String) checker.getLocale();
        assertTrue(locale == null);
    }

}