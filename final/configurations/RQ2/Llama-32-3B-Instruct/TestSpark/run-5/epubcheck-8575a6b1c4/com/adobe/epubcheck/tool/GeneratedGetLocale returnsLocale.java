package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedGetLocale returnsLocale {

    @Test
    public void getLocale

    returnsLocale() {
        EpubChecker checker = new EpubChecker();
        Locale locale = checkergetLocale();
        assertEquals(Locale.getDefault(), locale);
    }

}