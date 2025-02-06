package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class GeneratedGetLocaleDefault {

    @Test
    public void getLocaleDefault() {
        EpubChecker instance = new EpubChecker();
        Locale locale = instance.getLocale();
        assertNotNull(locale);
    }

}