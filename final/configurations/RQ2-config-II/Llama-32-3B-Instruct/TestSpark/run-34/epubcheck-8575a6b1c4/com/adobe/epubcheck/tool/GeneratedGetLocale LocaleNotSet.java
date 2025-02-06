package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedGetLocale LocaleNotSet {

    @Test
    public void getLocale

    LocaleNotSet() {
        EpubChecker epubChecker = new EpubChecker();
        Locale locale = epubChecker.getLocale();
        assertEquals(null, locale);
    }

}