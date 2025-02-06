package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashMap;

public class GeneratedGetLocaleTest {

    @Test
    public void getLocaleTest() {
        EpubChecker checker = new EpubChecker();
        Locale locale = checker.getLocale();
        assertNotNull(locale);
    }

}