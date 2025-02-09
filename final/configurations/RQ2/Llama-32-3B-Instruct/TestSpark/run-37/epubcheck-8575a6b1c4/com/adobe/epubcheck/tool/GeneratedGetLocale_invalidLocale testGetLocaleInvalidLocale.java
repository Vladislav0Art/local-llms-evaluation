package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedGetLocale_invalidLocale testGetLocaleInvalidLocale {

    @Test
    public void getLocale_invalidLocale

    testGetLocaleInvalidLocale() {
        EpubChecker epubChecker = new EpubChecker();
        Locale locale = "invalid-locale";
        try {
            assertEquals(locale, epubChecker.getLocale());
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            assertNotNull(e);
        }
    }

}