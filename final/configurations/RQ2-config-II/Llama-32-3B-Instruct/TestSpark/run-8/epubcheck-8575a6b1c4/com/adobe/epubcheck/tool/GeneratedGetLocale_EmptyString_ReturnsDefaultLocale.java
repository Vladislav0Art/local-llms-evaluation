package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashMap;
import java.util.Locale;

public class GeneratedGetLocale_EmptyString_ReturnsDefaultLocale {

    @Test
    public void getLocale_EmptyString_ReturnsDefaultLocale() {
        Locale locale = new EpubChecker().getLocale("");
        assertEquals(Locale.US, locale);
    }

}