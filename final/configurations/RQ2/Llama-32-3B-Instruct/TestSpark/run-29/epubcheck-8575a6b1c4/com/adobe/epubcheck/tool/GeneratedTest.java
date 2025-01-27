package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void getLocale_AnsiEn_ReturnsEnglishLocale() {
        Locale locale = new Locale("en", "US");
        EpubChecker epubChecker = Mockito.mock(EpubChecker.class);
        assertEquals(locale, (EpubChecker) epubChecker.getLocale());
    }

    @Test
    public void getLocale_FrReturnsFrenchLocale() {
        Locale locale = new Locale("fr", "FR");
        EpubChecker epubChecker = new EpubChecker();
        assertEquals(locale, epubChecker.getLocale());
    }

    @Test
    public void run_EbookFileWithNoErrors_RunsWithoutExceptions() {
        String[] args = {"file.ebk"};
        EpubChecker epubChecker = new EpubChecker();
        int result = (int) epubChecker.run(args);
        assertTrue(result >= 0);
    }

    @Test
    public void run_EbookFileWithError_ReturnsNonZeroExitCode() {
        String[] args = {"file.ebk", "--error"};
        EpubChecker epubChecker = new EpubChecker();
        int result = (int) epubChecker.run(args);
        assertFalse(result == 0);
    }

    @Test
    public void processEpubFile_EbookFileWithoutErrors_ReturnsZeroExitCode() {
        String[] args = {"file.ebk"};
        EpubChecker epubChecker = new EpubChecker();
        int result = (int) epubChecker.processEpubFile(args);
        assertEquals(0, result);
    }

    @Test
    public void validateFile_EbookFileWithoutErrors_ReturnsZeroReportLines() {
        String path = "file.ebk";
        EPUBVersion version = new EPUBVersion();
        Report report = new DefaultReportImpl();
        int result = (int) epubChecker.validateFile(path, version, report, null);
        assertEquals(0, result);
    }

    @Test
    public void validateFile_EbookFileWithErrors_ReturnsNonZeroReportLines() {
        String path = "file.ebk";
        EPUBVersion version = new EPUBVersion();
        Report report = new DefaultReportImpl();
        int result = (int) epubChecker.validateFile(path, version, report, null);
        assertTrue(result > 0);
    }

}