package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashMap;

public class GeneratedGetLocale_DefaultLocale_ReturnsDefaultLocale {

    @Test
    public void getLocale_DefaultLocale_ReturnsDefaultLocale() {
        EpubChecker checker = new EpubChecker();
        Locale locale = checker.getLocale();
        assertEquals(Locale.ENGLISH, locale);
    }

}