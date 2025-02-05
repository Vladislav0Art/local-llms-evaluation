package com.adobe.epubcheck.tool;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.util.EPUBVersion;

import java.util.Locale;

import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void getLocaleTest() {
        EpubChecker checker = new EpubChecker();
        Locale result = checker.getLocale();
        assertTrue(result instanceof Locale);
    }

    @Test
    public void runWithValidArgsTest() {
        EpubChecker checker = new EpubChecker();
        String[] args = {"testFile", "en"};
        int result = checker.run(args);
        assertEquals(0, result);
    }

    @Test
    public void runWithInvalidArgsTest() {
        EpubChecker checker = new EpubChecker();
        String[] args = {};
        int result = checker.run(args);
        assertEquals(1, result);
    }

    @Test
    public void processEpubFileTest() {
        EpubChecker checker = new EpubChecker();
        String[] args = {"testFile", "EPUB_3", "profile"};
        int result = checker.processEpubFile(args);
        assertEquals(0, result);
    }

    @Test
    public void validateFileTest() {
        EpubChecker checker = new EpubChecker();
        Report report = Mockito.mock(Report.class);
        String path = "test";
        int result = checker.validateFile(path, EPUBVersion.VERSION_3, report, EPUBProfile.DEFAULT);
        assertEquals(0, result);
    }

    @Test
    public void validateFileWithExceptionTest() {
        EpubChecker checker = new EpubChecker();
        Report report = Mockito.mock(Report.class);
        String path = "nonExistingFile";
        checker.validateFile(path, EPUBVersion.VERSION_3, report, EPUBProfile.DEFAULT);
    }

}