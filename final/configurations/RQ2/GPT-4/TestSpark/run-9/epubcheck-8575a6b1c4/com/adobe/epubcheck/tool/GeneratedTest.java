package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.util.DefaultReportImpl;
import org.junit.Assert;
import org.junit.Test;

import java.util.Locale;

public class GeneratedTest {

    @Test
    public void getLocaleTest() {
        EpubChecker epubChecker = new EpubChecker();
        Locale locale = epubChecker.getLocale();
        Assert.assertNotNull(locale);
    }

    @Test
    public void runTestWithNullArgs() {
        EpubChecker epubChecker = new EpubChecker();
        int result = epubChecker.run(null);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void runTestWithEmptyArgs() {
        EpubChecker epubChecker = new EpubChecker();
        int result = epubChecker.run(new String[0]);
        Assert.assertTrue(result < 0);
    }

    @Test
    public void processEpubFileTestWithNullArgs() {
        EpubChecker epubChecker = new EpubChecker();
        int result = epubChecker.processEpubFile(null);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void processEpubFileTestWithEmptyArgs() {
        EpubChecker epubChecker = new EpubChecker();
        int result = epubChecker.processEpubFile(new String[0]);
        Assert.assertTrue(result < 0);
    }

    @Test
    public void validateFileTestWithInvalidPath() {
        EpubChecker epubChecker = new EpubChecker();
        EPUBVersion version = EPUBVersion.VERSION_2;
        Report report = new DefaultReportImpl("testPath");
        EPUBProfile profile = EPUBProfile.DEFAULT;
        int result = epubChecker.validateFile("", version, report, profile);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void validateFileTestWithNullVersion() {
        EpubChecker epubChecker = new EpubChecker();
        Report report = new DefaultReportImpl("testPath");
        EPUBProfile profile = EPUBProfile.DEFAULT;
        int result = epubChecker.validateFile("testPath", null, report, profile);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void validateFileTestWithNullReport() {
        EpubChecker epubChecker = new EpubChecker();
        EPUBVersion version = EPUBVersion.VERSION_2;
        EPUBProfile profile = EPUBProfile.DEFAULT;
        int result = epubChecker.validateFile("testPath", version, null, profile);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void validateFileTestWithNullProfile() {
        EpubChecker epubChecker = new EpubChecker();
        EPUBVersion version = EPUBVersion.VERSION_2;
        Report report = new DefaultReportImpl("testPath");
        int result = epubChecker.validateFile("testPath", version, report, null);
        Assert.assertEquals(-1, result);
    }

}