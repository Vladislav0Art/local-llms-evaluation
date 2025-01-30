package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.util.DefaultReportImpl;
import org.junit.Test;

import java.util.Locale;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedTest {

    @Test
    public void runWithEmptyArgsTest() {
        EpubChecker epubChecker = new EpubChecker();
        int expected = 1;
        String[] args = new String[0];
        int actual = epubChecker.run(args);
        assertEquals(expected, actual);
    }

    @Test
    public void runWithInvalidArgsTest() {
        EpubChecker epubChecker = new EpubChecker();
        int expected = 1;
        String[] args = {"/invalid/path"};
        int actual = epubChecker.run(args);
        assertEquals(expected, actual);
    }

    @Test
    public void processEpubFileTest() {
        EpubChecker epubChecker = new EpubChecker();
        int expected = 1;
        String[] args = {"sample.txt"};
        int actual = epubChecker.processEpubFile(args);
        assertEquals(expected, actual);
    }

    @Test
    public void processEpubFileWithEmptyArgsTest() {
        EpubChecker epubChecker = new EpubChecker();
        int expected = 1;
        String[] args = new String[0];
        int actual = epubChecker.processEpubFile(args);
        assertEquals(expected, actual);
    }

    @Test
    public void validateFileTest() {
        EpubChecker epubChecker = new EpubChecker();
        int expected = 1;
        String path = "/invalid/path";
        int actual = epubChecker.validateFile(path, EPUBVersion.VERSION_2, new DefaultReportImpl(path), EPUBProfile.DEFAULT);
        assertEquals(expected, actual);
    }

    @Test
    public void getLocaleTest() {
        EpubChecker epubChecker = new EpubChecker();
        Locale expected = Locale.getDefault();
        Locale actual = epubChecker.getLocale();
        assertEquals(expected, actual);
    }

}