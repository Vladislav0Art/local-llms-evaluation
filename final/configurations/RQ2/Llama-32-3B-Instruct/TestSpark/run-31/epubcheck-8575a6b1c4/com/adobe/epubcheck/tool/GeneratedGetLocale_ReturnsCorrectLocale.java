package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;

public class GeneratedGetLocale_ReturnsCorrectLocale {

    @Test
    public void getLocale_ReturnsCorrectLocale() {
        Locale locale = new EpubChecker().getLocale();
        assertEquals(Locale.ENGLISH, locale);
    }

}