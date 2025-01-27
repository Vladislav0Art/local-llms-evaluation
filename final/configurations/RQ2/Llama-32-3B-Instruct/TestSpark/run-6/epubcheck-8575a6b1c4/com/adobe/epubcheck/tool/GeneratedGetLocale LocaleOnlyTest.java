package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;

public class GeneratedGetLocale LocaleOnlyTest {

    @Test
    public void getLocale

    LocaleOnlyTest() {
        EpubChecker instance = new EpubChecker();
        assertEquals(Locale.ENGLISH, instance.getLocale(), 0.01);
    }

}