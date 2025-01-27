package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;

public class GeneratedGetLocaleCustom {

    @Test
    public void getLocaleCustom() {
        EpubChecker checker = new EpubChecker();
        Locale locale = new Locale("en", "US");
        checker.setLocale(locale);
        Locale actualLocale = checker.Locale;
        assertEquals(locale, actualLocale);
    }

}