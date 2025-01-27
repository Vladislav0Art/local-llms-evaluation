package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestSetLanguageAndLocale {

    @Test
    public void testSetLanguageAndLocale() {
        EpubChecker checker = new EpubChecker();
        assert checker.getLanguage().isEmpty();
        assert checker.getLocale().isEmpty();
        checker.setLanguage("fr_FR");
        checker.setLocale("fr_FR");
        assertEquals("fr_FR", checker.getLanguage());
        assertEquals("fr_FR", checker.getLocale());
    }

}