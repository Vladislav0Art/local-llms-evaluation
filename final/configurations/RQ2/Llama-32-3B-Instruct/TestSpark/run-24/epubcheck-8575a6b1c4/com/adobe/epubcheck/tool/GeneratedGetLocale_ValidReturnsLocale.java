package com.adobe.epubcheck.tool;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class GeneratedGetLocale_ValidReturnsLocale {

    @BeforeClass
    public static void init() {
        // Initialize the class under test and any necessary resources.
    }

    @Test
    public void getLocale_ValidReturnsLocale() {
        Locale locale = new Locale("en", "US");
        EpubChecker checker = new EpubChecker();
        assertEquals(locale, checker.getLocale());
    }

}