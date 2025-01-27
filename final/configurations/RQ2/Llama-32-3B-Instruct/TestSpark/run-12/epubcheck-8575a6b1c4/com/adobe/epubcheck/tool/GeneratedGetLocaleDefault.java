package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;

public class GeneratedGetLocaleDefault {

    @Test
    public void getLocaleDefault() {
        EpubChecker checker = new EpubChecker();
        Locale locale = checkergetLocale();
        assertEquals(Locale.getDefault(), locale);
    }

}