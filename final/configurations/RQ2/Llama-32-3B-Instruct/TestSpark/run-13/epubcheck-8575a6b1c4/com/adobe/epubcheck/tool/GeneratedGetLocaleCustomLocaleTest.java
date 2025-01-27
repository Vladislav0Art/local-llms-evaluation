package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedGetLocaleCustomLocaleTest {

    @Test
    public void getLocaleCustomLocaleTest() {
        EpubChecker checker = new EpubChecker();
        Locale locale = Locale.FRENCH;
        checker.setLocale(locale);
        Locale actualLocale = checker.getLocale();
        assertEquals(locale, actualLocale);
    }

}