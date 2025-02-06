package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedGetLocale LocaleTest {

    @Test
    public void getLocale

    LocaleTest() {
        EpubChecker check = new EpubChecker();
        Locale locale = check.getLocale();
        assertEquals(Locale.getDefault(), locale);
    }

}