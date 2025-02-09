package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Locale;

public class GeneratedTest {

    @Test
    public void getLocaleTest() {
        EpubChecker epubChecker = new EpubChecker();
        Locale locale = epubChecker.getLocale();
        assertEquals(Locale.getDefault(), locale);
    }

    @Test
    public void runValidArgsTest() {
        EpubChecker epubChecker = new EpubChecker();
        String[] validArgs = {"testFile.epub"};
        int result = epubChecker.run(validArgs);
        assertEquals(0, result);
    }

    @Test
    public void runInvalidArgsTest() {
        EpubChecker epubChecker = new EpubChecker();
        String[] invalidArgs = {"nonexistent.epub"};
        int result = epubChecker.run(invalidArgs);
        assertEquals(1, result);
    }

    @Test
    public void processEpubFileValidArgsTest() {
        EpubChecker epubChecker = new EpubChecker();
        String[] validArgs = {"testFile.epub"};
        int result = epubChecker.processEpubFile(validArgs);
        assertEquals(0, result);
    }

    @Test
    public void processEpubFileInvalidArgsTest() {
        EpubChecker epubChecker = new EpubChecker();
        String[] invalidArgs = {"nonexistent.epub"};
        int result = epubChecker.processEpubFile(invalidArgs);
        assertEquals(1, result);
    }

    @Test
    public void validateFileValidArgsTest() {
        EpubChecker epubChecker = new EpubChecker();
        Report report = new DefaultReportImpl("testFile.epub");
        EPUBProfile profile = EPUBProfile.OPF_2_0;
        int result = epubChecker.validateFile("testFile.epub", EPUBVersion.VERSION_2_0, report, profile);
        assertEquals(0, result);
        assertTrue(report.getErrors().isEmpty());
    }

    @Test
    public void validateFileInvalidArgsTest() {
        EpubChecker epubChecker = new EpubChecker();
        Report report = new DefaultReportImpl("nonexistent.epub");
        EPUBProfile profile = EPUBProfile.OPF_2_0;
        int result = epubChecker.validateFile("nonexistent.epub", EPUBVersion.VERSION_2_0, report, profile);
        assertEquals(1, result);
        assertFalse(report.getErrors().isEmpty());
    }

}