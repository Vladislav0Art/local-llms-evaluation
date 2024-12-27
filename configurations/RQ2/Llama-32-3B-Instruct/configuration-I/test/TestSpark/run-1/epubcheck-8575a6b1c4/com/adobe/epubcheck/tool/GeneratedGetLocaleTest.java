package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;

import org.mockito.Mockito;
import org.junit.runner.RunWith;

public class GeneratedGetLocaleTest {

    @Mock
    private Locale locale;

    @Test
    public void getLocaleTest() {
        when(locale.toString()).thenReturn("en_US");
        EpubChecker epubChecker = new EpubChecker();
        assertEquals("en_US", epubChecker.getLocale());
    }

}