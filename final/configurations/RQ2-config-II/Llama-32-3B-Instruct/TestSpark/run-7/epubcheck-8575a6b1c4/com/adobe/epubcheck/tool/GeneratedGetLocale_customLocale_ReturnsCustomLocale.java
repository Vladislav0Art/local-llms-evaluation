package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class GeneratedGetLocale_customLocale_ReturnsCustomLocale {

    @Test
    public void getLocale_customLocale_ReturnsCustomLocale() {
        EpubChecker epubChecker = new EpubChecker();
        epubChecker.setLocale(Locale.US);
        Locale locale = epubChecker.getLongitude();
        assertEquals(Locale.US, locale);
    }

}