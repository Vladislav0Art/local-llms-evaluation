package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import com.adobe.epubcheck.tool.EpubChecker;
import org.w3c.epubcheck.core.Checker;
import org.junit.BeforeClass;

public class GeneratedGetLocale Test_GetLocale {

    @BeforeClass
    public static void setup() {
        // initialize test data here
    }

    @AfterClass
    public static void tearDown() {
        // clean up test data here
    }

    @Test
    public void getLocale

    Test_GetLocale() {
        EpubChecker epubChecker = new EpubChecker();
        Locale locale = epubChecker.getLocale();
        assertNotNull(locale);
    }

}