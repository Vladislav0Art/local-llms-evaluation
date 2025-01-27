package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileWriter;
import java.net.URI;
import java.util.HashMap;
import java.util.Locale;

public class GeneratedGetLocale_NullReturnsDefaultLocale {

    @Test
    public void getLocale_NullReturnsDefaultLocale() {
        Locale locale = new EpubChecker().getLocale(null);
        assertNotNull(locale);
    }

}