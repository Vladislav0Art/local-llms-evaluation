package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;

public class GeneratedGetLocale_NormalTest {

    @Test
    public void getLocale_NormalTest() {
        EpubChecker instance = new EpubChecker();
        Locale locale = instancegetLocale();
        assertNotNull(locale);
    }

}