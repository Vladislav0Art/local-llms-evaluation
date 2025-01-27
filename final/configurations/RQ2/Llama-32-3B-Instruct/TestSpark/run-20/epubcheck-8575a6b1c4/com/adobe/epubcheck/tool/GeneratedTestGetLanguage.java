package com.adobe.epubcheck.tool;

public class GeneratedTestGetLanguage {

    @Test
    public void testGetLanguage() {
        EpubChecker checker = new EpubChecker();
        String language = (String) checker.getLanguage();
        assertTrue(language == null);
    }

}