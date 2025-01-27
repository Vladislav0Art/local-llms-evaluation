package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashMap;

public class GeneratedGetLocale_MatchesMockedLocale {

    @Test
    public void getLocale_MatchesMockedLocale() throws Exception {
        MockLocale locale = new MockLocale();
        EpubChecker checker = new EpubChecker();
        Locale result = checkergetLocale();
        assertEquals(locale, result);
    }

}