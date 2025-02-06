package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashMap;
import java.util.Locale;

public class GeneratedGetLocale_EmptyString_ReturnsEmptyLocale {

    @Test
    public void getLocale_EmptyString_ReturnsEmptyLocale() {
        EpubChecker checker = new EpubChecker();
        Locale locale = checker.getLocale("");
        assertEquals(Locale.Empty, locale);
    }

}