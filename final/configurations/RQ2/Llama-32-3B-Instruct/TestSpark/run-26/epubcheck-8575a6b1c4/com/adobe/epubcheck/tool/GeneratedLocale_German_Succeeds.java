package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedLocale_German_Succeeds {

    @Test
    public void locale_German_Succeeds() {
        Locale expectedLocale = Locale.GERMAN;
        EpubChecker checker = new EpubChecker();
        assertEquals(expectedLocale, checkergetLocale());
    }

}