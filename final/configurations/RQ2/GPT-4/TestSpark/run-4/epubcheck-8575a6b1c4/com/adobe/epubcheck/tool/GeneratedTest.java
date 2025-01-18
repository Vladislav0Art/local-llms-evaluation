package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.EpubCheck;
import com.adobe.epubcheck.tool.EpubChecker;
import org.junit.Assert;
import org.junit.Test;

import java.util.Locale;

public class GeneratedTest {

    @Test
    public void getLocaleDefaultTest() {
        EpubChecker epubChecker = new EpubChecker();
        Locale locale = epubChecker.getLocale();
        Assert.assertEquals(Locale.getDefault(), locale);
    }

    @Test
    public void runNullArgsTest() {
        EpubChecker epubChecker = new EpubChecker();
        int result = epubChecker.run(null);
        Assert.assertEquals(1, result);
    }

    @Test
    public void runEmptyArgsTest() {
        EpubChecker epubChecker = new EpubChecker();
        int result = epubChecker.run(new String[0]);
        Assert.assertEquals(0, result);
    }

    @Test
    public void processEpubFileEmptyArgsTest() {
        EpubChecker epubChecker = new EpubChecker();
        int result = epubChecker.processEpubFile(new String[0]);
        Assert.assertEquals(0, result);
    }

    @Test
    public void processEpubFileNullArgsTest() {
        EpubChecker epubChecker = new EpubChecker();
        int result = epubChecker.processEpubFile(null);
        Assert.assertEquals(1, result);
    }

    @Test
    public void validateFileInvalidPathTest() {
        EpubChecker epubChecker = new EpubChecker();
        int result = epubChecker.validateFile("invalidPath", null, null, null);
        Assert.assertEquals(1, result);
    }

    @Test
    public void validateFileValidPathTest() {
        EpubChecker epubChecker = new EpubChecker();
        int result = epubChecker.validateFile("valid.epub", null, null, null);
        Assert.assertEquals(0, result);
    }

}