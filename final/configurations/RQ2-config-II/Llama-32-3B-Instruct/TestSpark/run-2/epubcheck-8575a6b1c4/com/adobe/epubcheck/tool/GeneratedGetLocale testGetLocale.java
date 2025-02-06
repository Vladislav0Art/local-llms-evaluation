package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.io.File;
import java.util.Locale;

public class GeneratedGetLocale testGetLocale {

    @Test
    public void getLocale

    testGetLocale() {
        EpubChecker instance = new EpubChecker();
        Locale locale = instance.getLocale();
        assertNotNull(locale);
    }

}