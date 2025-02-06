package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedGetLocale LocaleReturn {

    @Test
    public void getLocale

    LocaleReturn() {
        EpubChecker epubChecker = new EpubChecker();
        Locale locale = epubChecker.getLocale();
        assertNotNull(locale);
    }

}