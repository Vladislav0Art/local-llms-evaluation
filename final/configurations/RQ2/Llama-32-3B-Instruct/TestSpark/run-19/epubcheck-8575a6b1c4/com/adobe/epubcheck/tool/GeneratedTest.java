package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void locale() {
        EpubChecker checker = new EpubChecker();
        Locale locale = checker.getLocale();
        assertFalse(locale == null);
    }

    @Test
    public void run() throws Exception {
        String[] args = {"--locale", "en"};
        EpubChecker checker = new EpubChecker();
        int result = checker.run(args);
        assertTrue(result >= 0);
    }

    @Test
    public void processEpubFileDeprecated() {
        EpubChecker checker = new EpubChecker();
        String[] args = {"--locale", "en"};
        int result = checker.processEpubFile(args);
        assertTrue(result < 0);
    }

    @Test
    public void validateFileSuccess() throws Exception {
        EpubChecker checker = new EpubChecker();
        String path = "path/to/file.epub";
        EPUBVersion version = EPUBVersion.V2_0;
        Report report = new DefaultReportImpl();
        int result = checker.validateFile(path, version, report, new EPUBProfile());
        assertTrue(result == 0);
    }

    @Test
    public void validateFileFailure() throws Exception {
        EpubChecker checker = new EpubChecker();
        String path = "path/to/invalid.epub";
        EPUBVersion version = EPUBVersion.V2_0;
        Report report = new DefaultReportImpl();
        int result = checker.validateFile(path, version, report, new EPUBProfile());
        assertTrue(result != 0);
    }

    @Test
    public void validateFileInvalidVersion() throws Exception {
        EpubChecker checker = new EpubChecker();
        String path = "path/to/file.epub";
        EPUBVersion version = EPUBVersion.V3_0;
        Report report = new DefaultReportImpl();
        int result = checker.validateFile(path, version, report, new EPUBProfile());
        assertTrue(result != 0);
    }

    @Test
    public void validateFileInvalidPath() throws Exception {
        EpubChecker checker = new EpubChecker();
        String path = "invalid/path";
        EPUBVersion version = EPUBVersion.V2_0;
        Report report = new DefaultReportImpl();
        int result = checker.validateFile(path, version, report, new EPUBProfile());
        assertTrue(result != 0);
    }

    @Test
    public void validateFileInvalidEPUB() throws Exception {
        EpubChecker checker = new EpubChecker();
        String path = "invalid/epub";
        EPUBVersion version = EPUBVersion.V2_0;
        Report report = new DefaultReportImpl();
        int result = checker.validateFile(path, version, report, new EPUBProfile());
        assertTrue(result != 0);
    }

}