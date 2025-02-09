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

public class GeneratedTest {

    @Test
    public void runValidArgsTest() {
        EpubChecker epubChecker = new EpubChecker();
        String[] args = {"path-to-epub", "-v", "3.0"};
        int returnCode = epubChecker.run(args);
        assertEquals(0, returnCode);
    }

    @Test
    public void runWithNullArgsTest() {
        EpubChecker epubChecker = new EpubChecker();
        String[] args = null;
        epubChecker.run(args);
    }

    @Test
    public void getLocaleDefaultTest() {
        EpubChecker epubChecker = new EpubChecker();
        Locale expectedLocale = Locale.getDefault();
        Locale actualLocale = epubChecker.getLocale();
        assertEquals(expectedLocale, actualLocale);
    }

    @Test
    public void processEpubFileValidArgsTest() {
        EpubChecker epubChecker = new EpubChecker();
        String[] args = {"path-to-epub", "-v", "3.0"};
        int returnCode = epubChecker.processEpubFile(args);
        assertEquals(0, returnCode);
    }

    @Test
    public void processEpubFileNullArgsTest() {
        EpubChecker epubChecker = new EpubChecker();
        String[] args = null;
        epubChecker.processEpubFile(args);
    }

    @Test
    public void validateFileValidArgsTest() {
        EpubChecker epubChecker = new EpubChecker();
        Report reportMock = mock(Report.class);
        String path = "/path/to/file";
        int returnCode = epubChecker.validateFile(path, EPUBVersion.VERSION_2, reportMock, EPUBProfile.DEFAULT);
        assertEquals(0, returnCode);
    }

    @Test
    public void validateFileNullArgsTest() {
        EpubChecker epubChecker = new EpubChecker();
        epubChecker.validateFile(null, null, null, null);
    }

}