package com.adobe.epubcheck.tool;

public class GeneratedTestSetLocale {

    @Test
    public void testSetLocale() {
        EpubChecker checker = new EpubChecker();
        boolean set = checker.setLocale("fr_FR");
        assertTrue(set);
        String locale = (String) checker.getLocale();
        assertEquals("fr_FR", locale);
    }

}