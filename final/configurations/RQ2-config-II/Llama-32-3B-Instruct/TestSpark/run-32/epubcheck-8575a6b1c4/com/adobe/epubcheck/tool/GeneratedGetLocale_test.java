package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Locale;

public class GeneratedGetLocale_test {

    @Test
    public void getLocale_test() {
        Locale locale = new Locale("en", "US");
        assertEquals(locale, new EpubChecker().getLocale());
    }

}