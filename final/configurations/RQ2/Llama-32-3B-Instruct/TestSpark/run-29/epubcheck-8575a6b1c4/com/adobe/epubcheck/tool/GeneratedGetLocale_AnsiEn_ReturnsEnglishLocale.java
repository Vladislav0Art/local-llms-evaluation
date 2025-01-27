package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedGetLocale_AnsiEn_ReturnsEnglishLocale {

    @Test
    public void getLocale_AnsiEn_ReturnsEnglishLocale() {
        Locale locale = new Locale("en", "US");
        EpubChecker epubChecker = Mockito.mock(EpubChecker.class);
        assertEquals(locale, (EpubChecker) epubChecker.getLocale());
    }

}