package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class GeneratedGetLocale_GermanDefault Locale {

    @Test
    public void getLocale_GermanDefault

    Locale() {
        EpubChecker checker = new EpubChecker();
        assertEquals(Locale.GERMAN, checkergetLocale());
    }

}