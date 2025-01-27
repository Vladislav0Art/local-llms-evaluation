package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedGetLocale {

    @Test
    public void getLocale() {
        EpubChecker checker = new EpubChecker();
        Locale locale = checkergetLocale();
        assertEquals(Locale.getDefault(), locale);
    }

}