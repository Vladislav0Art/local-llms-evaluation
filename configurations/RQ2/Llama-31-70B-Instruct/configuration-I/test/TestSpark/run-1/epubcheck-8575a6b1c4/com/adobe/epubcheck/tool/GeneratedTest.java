package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void getLocaleTest() {
        EpubChecker epubChecker = new EpubChecker();
        Locale locale = epubChecker.getLocale();
        assertNotNull(locale);
    }

    @Test
    public void runTest() {
        EpubChecker epubChecker = new EpubChecker();
        String[] args = new String[]{"arg1", "arg2"};
        int result = epubChecker.run(args);
        assertTrue(result >= 0);
    }

    @Test
    public void processEpubFileTest() {
        EpubChecker epubChecker = new EpubChecker();
        String[] args = new String[]{"arg1", "arg2"};
        int result = epubChecker.processEpubFile(args);
        assertTrue(result >= 0);
    }

    @Test
    public void validateFileTest() {
        EpubChecker epubChecker = new EpubChecker();
        String path = "test.epub";
        EPUBVersion version = EPUBVersion.VERSION_3;
        Report report = mock(Report.class);
        EPUBProfile profile = EPUBProfile.DEFAULT;
        int result = epubChecker.validateFile(path, version, report, profile);
        assertTrue(result >= 0);
    }

}