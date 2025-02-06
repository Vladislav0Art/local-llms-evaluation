package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class GeneratedGetLocale_DefaultLocale_ReturnsDefaultLocale {

    @Test
    public void getLocale_DefaultLocale_ReturnsDefaultLocale() {
        Locale locale = new EpubChecker().getLocale();
        assertEquals(Locale.getDefault(), locale);
    }

}