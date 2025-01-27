package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedGetLocale_UnknownLocale_ThrowsException {

    @Test
    public void getLocale_UnknownLocale_ThrowsException() {
        Locale locale = Locale.UNKNOWN;
        EpubChecker checker = new EpubChecker();
        try {
            checker.getLocalize(locale);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected exception
        }
    }

}