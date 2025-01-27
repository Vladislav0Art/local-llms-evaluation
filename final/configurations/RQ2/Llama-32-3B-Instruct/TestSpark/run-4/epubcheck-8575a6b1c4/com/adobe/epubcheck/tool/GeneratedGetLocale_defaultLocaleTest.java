package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Locale;

public class GeneratedGetLocale_defaultLocaleTest {

    @Test
    public void getLocale_defaultLocaleTest() {
        EpubChecker checker = new EpubChecker();
        Locale locale = checker.getLocale();
        assertNotNull(locale);
        assertEquals(Locale.getDefault(), locale);
    }

}