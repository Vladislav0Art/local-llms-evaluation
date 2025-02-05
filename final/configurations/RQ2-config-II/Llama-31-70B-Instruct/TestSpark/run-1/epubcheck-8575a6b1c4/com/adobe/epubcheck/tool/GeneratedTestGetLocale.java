package com.adobe.epubcheck.tool;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.File;
import java.io.IOException;
import java.util.Locale;

import org.junit.Test;
import org.w3c.epubcheck.api.EPUBProfile;
import org.w3c.epubcheck.api.EpubCheck;
import org.w3c.epubcheck.api.Report;
import org.w3c.epubcheck.util.EPUBVersion;

public class GeneratedTestGetLocale {

    @Test
    public void testGetLocale() {
        EpubChecker epubChecker = new EpubChecker();
        Locale locale = epubChecker.getLocale();
        assertNotNull(locale);
    }

}