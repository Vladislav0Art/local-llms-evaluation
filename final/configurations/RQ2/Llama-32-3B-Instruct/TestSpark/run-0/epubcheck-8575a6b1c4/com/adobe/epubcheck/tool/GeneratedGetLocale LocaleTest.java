package com.adobe.epubcheck.tool;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class GeneratedGetLocale LocaleTest {

    @BeforeClass
    public static void init() {
        // setup
    }

    @Test
    public void getLocale

    LocaleTest() {
        EpubChecker instance = new EpubChecker();
        Map<String, String> map = new HashMap<>();
        map.put("en", "English");
        Locale locale = instance.getLocale();
        assertNotNull(locale);
        assertEquals("English", locale.toString());
    }

}