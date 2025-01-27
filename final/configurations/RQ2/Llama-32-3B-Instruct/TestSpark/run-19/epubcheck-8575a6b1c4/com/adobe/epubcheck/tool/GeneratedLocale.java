package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedLocale {

    @Test
    public void locale() {
        EpubChecker checker = new EpubChecker();
        Locale locale = checker.getLocale();
        assertFalse(locale == null);
    }

}