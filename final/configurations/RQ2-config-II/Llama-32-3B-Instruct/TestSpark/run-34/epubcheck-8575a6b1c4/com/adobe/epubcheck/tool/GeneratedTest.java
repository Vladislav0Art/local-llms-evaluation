package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedTest {

    @Test
    public void getLocale

    LocaleReturn() {
        EpubChecker epubChecker = new EpubChecker();
        Locale locale = epubChecker.getLocale();
        assertNotNull(locale);
    }

    @Test
    public void getLocale

    LocaleNotSet() {
        EpubChecker epubChecker = new EpubChecker();
        Locale locale = epubChecker.getLocale();
        assertEquals(null, locale);
    }

    @Test
    public void run

    RunEpubFileValid() throws Exception {
        String[] args = {"path/to/epub/file.epub", "valid-profile"};
        EpubChecker epubChecker = new EpubChecker();
        int result = epubChecker.run(args);
        assertEquals(0, result);
    }

    @Test
    public void run

    RunEpubFileInvalid() throws Exception {
        String[] args = {"path/to/epub/file.epub", "invalid-profile"};
        EpubChecker epubChecker = new EpubChecker();
        int result = epubChecker.run(args);
        assertEquals(1, result);
    }

    @Test
    public void run

    RunEpubFileEmptyArgs() throws Exception {
        String[] args = {};
        EpubChecker epubChecker = new EpubChecker();
        int result = epubChecker.run(args);
        assertEquals(1, result);
    }

    @Test
    public void validateFile

    ValidatePathValid() throws Exception {
        File file = new File("path/to/valid.epub");
        EPUBVersion version = EPUBVersion.V40;
        Report report = new DefaultReportImpl();
        EpubChecker epubChecker = new EpubChecker();
        int result = epubChecker.validateFile(file.getAbsolutePath(), version, report, null);
        assertEquals(0, result);
    }

    @Test
    public void validateFile

    ValidatePathInvalid() throws Exception {
        File file = new File("path/to/invalid.epub");
        EPUBVersion version = EPUBVersion.V40;
        Report report = new DefaultReportImpl();
        EpubChecker epubChecker = new EpubChecker();
        int result = epubChecker.validateFile(file.getAbsolutePath(), version, report, null);
        assertEquals(1, result);
    }

    @Test
    public void validateFile

    ValidatePathNoProfile() throws Exception {
        File file = new File("path/to/valid.epub");
        EPUBVersion version = EPUBVersion.V40;
        Report report = new DefaultReportImpl();
        EpubChecker epubChecker = new EpubChecker();
        int result = epubChecker.validateFile(file.getAbsolutePath(), version, report, null);
        assertEquals(1, result);
    }

    @Test
    public void validateFile

    ValidatePathInvalidProfile() throws Exception {
        File file = new File("path/to/valid.epub");
        EPUBVersion version = EPUBVersion.V40;
        Report report = new DefaultReportImpl();
        EpubChecker epubChecker = new EpubChecker();
        int result = epubChecker.validateFile(file.getAbsolutePath(), version, report, "invalid-profile");
        assertEquals(1, result);
    }

}