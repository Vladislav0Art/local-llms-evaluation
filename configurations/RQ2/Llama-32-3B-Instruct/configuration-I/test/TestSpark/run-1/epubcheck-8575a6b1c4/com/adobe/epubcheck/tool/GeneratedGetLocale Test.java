package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;
import org.junit.runner.RunWith;

public class GeneratedGetLocale Test {

    @Mock
    private Locale locale;

    @Test
    public void getLocale

    Test() {
        when(locale.toString()).thenReturn("en_US");
        EpubChecker epubChecker = new EpubChecker();
        assertEquals("en_US", epubChecker.getLocale());
    }

}