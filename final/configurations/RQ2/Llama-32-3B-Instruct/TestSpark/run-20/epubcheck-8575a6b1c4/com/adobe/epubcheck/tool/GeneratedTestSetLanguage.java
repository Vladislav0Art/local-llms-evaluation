package com.adobe.epubcheck.tool;

public class GeneratedTestSetLanguage {

    @Test
    public void testSetLanguage() {
        EpubChecker checker = new EpubChecker();
        boolean set = checker.setLanguage("fr_FR");
        assertTrue(set);
        String language = (String) checker.getLanguage();
        assertEquals("fr_FR", language);
    }

}