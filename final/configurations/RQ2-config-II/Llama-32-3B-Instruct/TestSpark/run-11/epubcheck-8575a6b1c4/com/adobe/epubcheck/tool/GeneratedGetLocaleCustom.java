package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class GeneratedGetLocaleCustom {

    @Test
    public void getLocaleCustom() {
        EpubChecker instance = new EpubChecker();
        instance.setLocale(Locale.US);
        Locale locale = instance.getLocale();
        assertEquals(Locale.US, locale);
    }

}