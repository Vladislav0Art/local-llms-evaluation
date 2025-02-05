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
import org.w3c.epubcheck.api.EpubCheckFactory;
import org.w3c.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.tool.EpubChecker;

public class GeneratedTest {

    @Test
    public void testGetLocale() {
        EpubChecker epubChecker = new EpubChecker();
        Locale locale = epubChecker.getLocale();
        assertNotNull(locale);
    }

    @Test
    public void testRun() {
        EpubChecker epubChecker = new EpubChecker();
        String[] args = new String[]{"test"};
        int result = epubChecker.run(args);
        assertEquals(0, result);
    }

    @Test
    public void testProcessEpubFile() {
        EpubChecker epubChecker = new EpubChecker();
        String[] args = new String[]{"test"};
        int result = epubChecker.processEpubFile(args);
        assertEquals(0, result);
    }

}