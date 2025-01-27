package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedGetLocale Test {

    @Test
    public void getLocale

    Test() {
        EpubChecker instance = new EpubChecker();
        Locale locale = instance.getLocale();
        assertEquals(Locale.ROOT, locale);
    }

}