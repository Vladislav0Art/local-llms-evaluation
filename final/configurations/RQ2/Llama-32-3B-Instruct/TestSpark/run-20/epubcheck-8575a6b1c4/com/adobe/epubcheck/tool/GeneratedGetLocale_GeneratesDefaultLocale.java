package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

public class GeneratedGetLocale_GeneratesDefaultLocale {

    @Test
    public void getLocale_GeneratesDefaultLocale() {
        EpubChecker checker = new EpubChecker();
        Locale locale = checker.getLocale();
        assertEquals(Locale.getDefault(), locale);
    }

}