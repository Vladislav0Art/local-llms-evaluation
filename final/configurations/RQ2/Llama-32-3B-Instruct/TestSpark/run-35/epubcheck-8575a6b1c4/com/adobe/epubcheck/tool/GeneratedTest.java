package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedTest {

    @Test
    public void getLocaleTest() {
        EpubChecker checker = new EpubChecker();
        assertEquals(Locale.ENGLISH, checker.getLocale());
    }

    @Test
    public void runTest() {
        String[] args = {"test_file.epub"};
        EpubChecker checker = new EpubChecker();
        int result = checker.run(args);
        assertNotNull(result);
        assertFalse(result < 0);
    }

    @Test
    public void processEpubFileTest() {
        String[] args = {"test_file.epub"};
        EpubChecker checker = new EpubChecker();
        int result = checker.processEpubFile(args);
        assertNotNull(result);
        assertFalse(result < 0);
    }

    @Test
    public void validateFileTest_InvalidVersion() throws InvalidVersionException {
        String path = "test_file.epub";
        EPUBVersion version = EPUBVersion.V3_02;
        Report report = new DefaultReportImpl();
        EpubChecker checker = new EpubChecker();
        boolean result = checker.validateFile(path, version, report, null);
        assertFalse(result);
    }

    @Test
    public void validateFileTest_ValidVersion() {
        String path = "test_file.epub";
        EPUBVersion version = EPUBVersion.V3_02;
        Report report = new DefaultReportImpl();
        EpubChecker checker = new EpubChecker();
        boolean result = checker.validateFile(path, version, report, null);
        assertTrue(result);
    }

    @Test
    public void validateFileTest_NoProfile() {
        String path = "test_file.epub";
        EPUBVersion version = EPUBVersion.V3_02;
        Report report = new DefaultReportImpl();
        EpubChecker checker = new EpubChecker();
        boolean result = checker.validateFile(path, version, report, null);
        assertTrue(result);
    }

    @Test
    public void validateFileTest_GetReport() {
        String path = "test_file.epub";
        EPUBVersion version = EPUBVersion.V3_02;
        Report report = new DefaultReportImpl();
        EpubChecker checker = new EpubChecker();
        LocalizableReport localizableReport = checker.validateFile(path, version, null, null);
        assertNotNull(localizableReport);
    }

    @Test
    public void validateFileTest_GetReport_DoesNotContainAnyMessage() {
        String path = "test_file.epub";
        EPUBVersion version = EPUBVersion.V3_02;
        Report report = new DefaultReportImpl();
        EpubChecker checker = new EpubChecker();
        LocalizableReport localizableReport = checker.validateFile(path, version, null, null);
        assertTrue(localizableReport.getMessages().isEmpty());
    }

}