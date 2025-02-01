package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.util.Messages;
import org.junit.Test;

import java.io.File;
import java.util.Locale;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class GeneratedTest {

    @Test
    public void runInvalidArgsTest() {
        EpubChecker epubChecker = new EpubChecker();
        int result = epubChecker.run(new String[]{});
        assertEquals(1, result);
    }

    @Test
    public void runWithHelpArgsTest() {
        EpubChecker epubChecker = new EpubChecker();
        int result = epubChecker.run(new String[]{"-help"});
        assertEquals(0, result);
    }

    @Test
    public void runWithVersionArgsTest() {
        EpubChecker epubChecker = new EpubChecker();
        int result = epubChecker.run(new String[]{"-version"});
        assertEquals(0, result);
    }

    @Test
    public void getLocaleTest() {
        EpubChecker epubChecker = new EpubChecker();
        Locale result = epubChecker.getLocale();
        assertNotNull(result);
    }

    @Test
    public void processEpubFileTest() {
        EpubChecker epubChecker = new EpubChecker();
        int result = epubChecker.processEpubFile(new String[]{"-help"});
        assertEquals(0, result);
    }

    @Test
    public void validateFileTest() {
        EpubChecker epubChecker = new EpubChecker();
        String path = ""; // add suitable file path here
        Report report = new DefaultReportImpl(path);
        int result = epubChecker.validateFile(path, EPUBVersion.VERSION_3, report,
                EPUBProfile.DEFAULT);
        assertEquals(0, result);
    }

    @Test
    public void validateFileFailureTest() {
        EpubChecker epubChecker = new EpubChecker();
        String path = "invalid/path";
        Report report = new DefaultReportImpl(path);
        try {
            epubChecker.validateFile(path, EPUBVersion.VERSION_3, report,
                    EPUBProfile.DEFAULT);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            assertNotNull(e);
        }
    }

    @Test
    public void processFileTest() {
        EpubChecker epubChecker = new EpubChecker();
        String path = "invalid/path";
        Report report = new DefaultReportImpl(path);
        int result = epubChecker.processFile(report);
        assertEquals(1, result);
    }

    @Test
    public void createReportTest() throws IOException {
        EpubChecker epubChecker = new EpubChecker();
        Report report = epubChecker.createReport();
        assertNotNull(report);
    }

    @Test
    public void processArgumentsInvalidTest() {
        EpubChecker epubChecker = new EpubChecker();
        boolean result = epubChecker.processArguments(new String[]{});
        assertEquals(false, result);
    }

    @Test
    public void processArgumentsValidTest() {
        EpubChecker epubChecker = new EpubChecker();
        boolean result = epubChecker.processArguments(new String[]{"-help"});
        assertEquals(true, result);
    }

    @Test
    public void setCustomMessageFileFromEnvironmentTest() {
        EpubChecker epubChecker = new EpubChecker();
        epubChecker.setCustomMessageFileFromEnvironment();
        // No exception should be thrown
    }

    @Test
    public void displayHelpTest() {
        EpubChecker epubChecker = new EpubChecker();
        epubChecker.displayHelp();
        // No exception should be thrown
    }

    @Test
    public void displayVersionTest() {
        EpubChecker epubChecker = new EpubChecker();
        epubChecker.displayVersion();
        // No exception should be thrown
    }

}