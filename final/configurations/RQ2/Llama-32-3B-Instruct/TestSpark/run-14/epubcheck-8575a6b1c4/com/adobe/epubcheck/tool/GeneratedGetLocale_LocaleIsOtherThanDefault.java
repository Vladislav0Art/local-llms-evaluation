package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class GeneratedGetLocale_LocaleIsOtherThanDefault {

    private final EpubChecker epubChecker = new EpubChecker();

    @Test
    public void getLocale_LocaleIsOtherThanDefault() {
        Locale locale = Locale.FRANCE;
        epubChecker.setLocale(locale);
        Locale actualLocale = epubChecker.getLocale();
        assertEquals(locale, actualLocale);
    }

}