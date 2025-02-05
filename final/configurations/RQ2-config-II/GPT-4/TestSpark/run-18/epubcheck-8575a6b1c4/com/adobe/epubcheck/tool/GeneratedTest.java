package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.util.DefaultReportImpl;
import org.junit.Test;

import java.util.Locale;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void getLocale_DefaultLocaleTest() {
        EpubChecker epubChecker = new EpubChecker();
        Locale expected = Locale.getDefault();
        Locale actual = epubChecker.getLocale();
        assertEquals(expected, actual);
    }

    @Test
    public void run_EmptyArgsTest() {
        EpubChecker epubChecker = new EpubChecker();
        String[] emptyArgs = {};
        int result = epubChecker.run(emptyArgs);
        assertEquals(0, result);
    }

    @Test
    public void run_NullArgsTest() {
        EpubChecker epubChecker = new EpubChecker();
        String[] nullArgs = null;
        int result = epubChecker.run(nullArgs);
        assertEquals(0, result);
    }

    @Test
    public void processEpubFile_ValidArgsTest() {
        EpubChecker epubChecker = new EpubChecker();
        String[] validArgs = {"test.epub", "EPUB_3_0"};
        int result = epubChecker.processEpubFile(validArgs);
        assertEquals(0, result);
    }

    @Test
    public void processEpubFile_EmptyFileArgTest() {
        EpubChecker epubChecker = new EpubChecker();
        String[] emptyArgs = {""};
        epubChecker.processEpubFile(emptyArgs);
    }

    @Test
    public void validateFile_ValidFileTest() {
        EpubChecker epubChecker = new EpubChecker();
        String validPath = "test.epub";
        Report report = new DefaultReportImpl(validPath);
        int result = epubChecker.validateFile(validPath, EPUBVersion.VERSION_3_0, report, EPUBProfile.DEFAULT);
        assertEquals(0, result);
    }

    @Test
    public void validateFile_NullPathTest() {
        EpubChecker epubChecker = new EpubChecker();
        String nullPath = null;
        Report report = new DefaultReportImpl(nullPath);
        epubChecker.validateFile(nullPath, EPUBVersion.VERSION_3_0, report, EPUBProfile.DEFAULT);
    }

}