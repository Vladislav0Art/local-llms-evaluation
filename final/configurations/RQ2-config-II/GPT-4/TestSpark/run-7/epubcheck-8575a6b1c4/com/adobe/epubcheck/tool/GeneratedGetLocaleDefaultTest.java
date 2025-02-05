package com.adobe.epubcheck.tool;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedGetLocaleDefaultTest {

    @Test
    public void getLocaleDefaultTest() {
        EpubChecker epubChecker = new EpubChecker();
        Locale defaultLocale = Locale.getDefault();
        assertTrue(defaultLocale.equals(epubChecker.getLocale()));
    }

}