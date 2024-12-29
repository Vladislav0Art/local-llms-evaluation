package com.adobe.epubcheck.tool;

import java.util.Locale;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class GeneratedLocale_ReturnsCorrectLocale {

    @BeforeClass
    public static void init() {
        // setup
    }

    @Test
    public void locale_ReturnsCorrectLocale() {
        EpubChecker instance = new EpubChecker();
        Locale locale = instance.getLocale();
        assertNotNull(locale);
        assertEquals("en", locale.getLanguage());
        assertEquals("English", locale.getDisplayName());
    }

}