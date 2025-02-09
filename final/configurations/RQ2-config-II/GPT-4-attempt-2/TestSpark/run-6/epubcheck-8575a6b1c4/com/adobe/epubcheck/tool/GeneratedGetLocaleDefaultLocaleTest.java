package com.adobe.epubcheck.tool;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.Locale;
import java.io.File;
import java.io.FileNotFoundException;

import org.mockito.Mockito;

public class GeneratedGetLocaleDefaultLocaleTest {

    @Test
    public void getLocaleDefaultLocaleTest() {
        EpubChecker checker = new EpubChecker();
        assertEquals("Expected default locale", Locale.getDefault(), checker.getLocale());
    }

}