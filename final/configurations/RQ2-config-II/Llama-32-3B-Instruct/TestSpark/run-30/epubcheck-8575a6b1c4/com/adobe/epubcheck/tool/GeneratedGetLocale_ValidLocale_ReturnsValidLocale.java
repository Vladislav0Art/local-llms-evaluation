package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashMap;
import java.util.Locale;

public class GeneratedGetLocale_ValidLocale_ReturnsValidLocale {

    @Test
    public void getLocale_ValidLocale_ReturnsValidLocale() {
        EpubChecker checker = new EpubChecker();
        Locale locale = checker.getLocale("en_US");
        assertNotNull(locale);
    }

}