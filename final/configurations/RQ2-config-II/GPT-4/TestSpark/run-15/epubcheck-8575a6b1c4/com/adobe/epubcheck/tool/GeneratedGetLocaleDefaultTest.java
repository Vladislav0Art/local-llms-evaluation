package com.adobe.epubcheck.tool;

import org.junit.Test;

import java.util.Locale;

import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.api.EPUBProfile;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedGetLocaleDefaultTest {


    private final EpubChecker epubChecker = new EpubChecker();

    @Test
    public void getLocaleDefaultTest() {
        assertEquals(new Locale("en", "US"), epubChecker.getLocale());
    }

}