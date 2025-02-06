package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedGetLocale_Expected returnsLocale {

    @Test
    public void getLocale_Expected

    returnsLocale() {
        Locale locale = new Locale("en", "US");
        when(EpubChecker.class.getConstructor(Locale.class).createInstance(locale)).thenReturn(locale);
        assertEquals(locale, EpubChecker.getLocale());
    }

}