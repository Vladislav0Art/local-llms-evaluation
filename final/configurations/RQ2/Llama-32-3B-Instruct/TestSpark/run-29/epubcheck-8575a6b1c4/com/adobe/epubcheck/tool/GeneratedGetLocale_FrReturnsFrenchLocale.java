package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedGetLocale_FrReturnsFrenchLocale {

    @Test
    public void getLocale_FrReturnsFrenchLocale() {
        Locale locale = new Locale("fr", "FR");
        EpubChecker epubChecker = new EpubChecker();
        assertEquals(locale, epubChecker.getLocale());
    }

}