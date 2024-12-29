package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import com.adobe.epubcheck.api.Report;

import java.io.IOException;
import java.util.Locale;

import com.adobe.epubcheck.util.InvalidVersionException;
import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.util.DefaultReportImpl;
import org.mockito.Mockito;

public class GeneratedTest {

    EpubChecker epubChecker = new EpubChecker();

    @Test
    public void getLocaleTest() {
        Locale testLocale = epubChecker.getLocale();
        assertNotNull(testLocale);
        assertFalse(testLocale.toString().isEmpty());
    }

    @Test
    public void runValidArgsTest() {
        assertEquals(0, epubChecker.run(new String[]{"test.epub"}));
    }

    @Test
    public void runInvalidArgsTest() {
        epubChecker.run(new String[]{""});
    }

    @Test
    public void processEpubFileValidTest() {
        assertTrue(epubChecker.processEpubFile(new String[]{"test.epub"}) >= 0);
    }

    @Test
    public void processEpubFileNullTest() {
        epubChecker.processEpubFile(null);
    }

    @Test
    public void validateFileValidTest() throws IOException, InvalidVersionException {
        String path = "test.epub";
        EPUBVersion version = EPUBVersion.VERSION_2;
        Report report = new DefaultReportImpl(path);
        EPUBProfile profile = EPUBProfile.DEFAULT;
        assertTrue(epubChecker.validateFile(path, version, report, profile) >= 0);
    }

    @Test
    public void validateFileInvalidTest() throws IOException, InvalidVersionException {
        EpubChecker spyEpubChecker = Mockito.spy(epubChecker);

        String path = "test.epub";
        EPUBVersion version = EPUBVersion.VERSION_2;
        Report report = new DefaultReportImpl(path);
        EPUBProfile profile = EPUBProfile.DEFAULT;

        when(spyEpubChecker.validateFile(path, version, report, profile)).thenThrow(new RuntimeException("Invalid EPUB profile"));
        spyEpubChecker.validateFile(path, version, report, profile);
    }

}