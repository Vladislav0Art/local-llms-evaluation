package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;

import org.w3c.epubcheck.core.Checker;
import org.w3c.epubcheck.util.url.URLUtils;

public class GeneratedGetLocale testGetLocale {

    @Test
    public void getLocale

    testGetLocale() {
        Locale locale = EpubChecker(Locale.ROOT).getLocale();
        assertNotNull(locale);
    }

}