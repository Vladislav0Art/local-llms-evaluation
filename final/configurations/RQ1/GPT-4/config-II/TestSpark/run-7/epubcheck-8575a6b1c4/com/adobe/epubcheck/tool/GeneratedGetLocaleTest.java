package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import java.io.IOException;
import java.io.File;
import java.util.Locale;

public class GeneratedGetLocaleTest {

    @Test
    public void getLocaleTest() {
        EpubChecker epubChecker = new EpubChecker();
        Locale returnValue = epubChecker.getLocale();
        assertEquals(Locale.getDefault(), returnValue);
    }

}