package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashMap;

public class GeneratedGetLocale_CustomLocale_ReturnsCustomLocale {

    @Test
    public void getLocale_CustomLocale_ReturnsCustomLocale() {
        EpubChecker checker = new EpubChecker();
        checker.setLocale(Locale.FRENCH);
        Locale locale = checker.getLocale();
        assertEquals(Locale.FRENCH, locale);
    }

}