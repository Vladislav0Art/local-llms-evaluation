package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashMap;
import java.util.Locale;

public class GeneratedGetLocale_NonEmptyString_ReturnsCorrectLocale {

    @Test
    public void getLocale_NonEmptyString_ReturnsCorrectLocale() {
        Locale locale = new EpubChecker().getLocale("en_US");
        assertEquals(Locale.US, locale);
    }

}