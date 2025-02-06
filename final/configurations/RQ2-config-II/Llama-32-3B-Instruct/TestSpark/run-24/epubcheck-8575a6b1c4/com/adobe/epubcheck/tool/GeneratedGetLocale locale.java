package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class GeneratedGetLocale locale {

    @Test
    public void getLocale

    locale() {
        EpubChecker instance = new EpubChecker();
        Locale expectedLocale = new Locale("en", "US");
        Locale actualLocale = instance.getLocale();
        assertEquals(expectedLocale, actualLocale);
    }

}