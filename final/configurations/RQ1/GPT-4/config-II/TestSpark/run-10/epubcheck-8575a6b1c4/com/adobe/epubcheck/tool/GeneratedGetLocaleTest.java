package com.adobe.epubcheck.tool;

import org.junit.Test;

import java.util.Locale;

import static org.junit.Assert.*;

public class GeneratedGetLocaleTest {


    private EpubChecker epubChecker;

    @Test
    public void getLocaleTest() {
        epubChecker = new EpubChecker();
        assertEquals(Locale.getDefault(), epubChecker.getLocale());
    }

}