package com.adobe.epubcheck.tool;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Locale;

import org.junit.rules.TemporaryFolder;

public class GeneratedGetLocaleDefaultTest {

    @Test
    public void getLocaleDefaultTest() {
        EpubChecker epubChecker = new EpubChecker();
        Locale expectedLocale = Locale.getDefault();
        Locale actualLocale = epubChecker.getLocale();
        assertEquals(expectedLocale, actualLocale);
    }

}