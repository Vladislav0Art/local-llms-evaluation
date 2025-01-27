package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedGetLocale_Fr returnsFrenchLocale {

    @Test
    public void getLocale_Fr

    returnsFrenchLocale() {
        Locale locale = new Locale("fr", "FR");
        EpubChecker epubChecker = Mockito.mock(EpubChecker.class);
        assertEquals(locale, epubChecker.getLocale());
    }

}