package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.util.DefaultReportImpl;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Locale;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Mock
    private Report report;

    @Test
    public void testGetLocaleDefault() {
        EpubChecker checker = new EpubChecker();
        Locale locale = checker.getLocale();
        assertNotNull(locale);
        assertEquals(Locale.getDefault(), locale);
    }

    @Test
    public void testRunValidArgsTest() {
        String[] args = {"-v"};
        EpubChecker checker = new EpubChecker();
        int exitCode = checker.run(args);
        assertEquals(0, exitCode);
    }

    @Test
    public void testRunInvalidArgsTest() {
        EpubChecker checker = new EpubChecker();
        checker.run(new String[0]);
    }

    @Test
    public void testProcessEpubFileTest() {
        EpubChecker checker = new EpubChecker();
        String[] args = {"book.epub"};
        int result = checker.processEpubFile(args);
        assertEquals(0, result);
    }

    @Test
    public void validateFileInvalidFileTest() {
        MockitoAnnotations.initMocks(this);
        String invalidPath = "invalid_path";
        EpubChecker checker = new EpubChecker();
        checker.validateFile(invalidPath, EPUBVersion.VERSION_2, report, EPUBProfile.DEFAULT);
    }

    @Test
    public void validateFileInvalidVersionTest() {
        MockitoAnnotations.initMocks(this);
        String validPath = "valid_path";
        EpubChecker checker = new EpubChecker();
        checker.validateFile(validPath, null, report, EPUBProfile.DEFAULT);
    }

    @Test
    public void validateFileValidTest() {
        MockitoAnnotations.initMocks(this);
        String validPath = "valid_path";
        Report validReport = new DefaultReportImpl(validPath, false, EPUBVersion.VERSION_3);
        EPUBProfile validProfile = EPUBProfile.DEFAULT;
        EpubChecker checker = new EpubChecker();
        int result = checker.validateFile(validPath, EPUBVersion.VERSION_3, validReport, validProfile);
        assertEquals(0, result);
    }

}