package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.EPUBVersion;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Locale;

public class GeneratedTest {

    @Test
    public void getLocaleTest() {
        EpubChecker epubChecker = new EpubChecker();
        Locale locale = Locale.getDefault();
        Assert.assertEquals(locale, epubChecker.getLocale());
    }

    @Test
    public void runValidArgsTest() {
        EpubChecker epubChecker = new EpubChecker();
        String[] args = {"valid1.epub", "valid2.epub"};
        int result = epubChecker.run(args);
        Assert.assertEquals(0, result);
    }

    @Test
    public void runInvalidArgsTest() {
        EpubChecker epubChecker = new EpubChecker();
        String[] args = {"invalid1.epub", "invalid2.epub"};
        int result = epubChecker.run(args);
        Assert.assertNotEquals(0, result);
    }

    @Test
    public void processEpubFileTest() {
        EpubChecker epubChecker = new EpubChecker();
        String[] args = {"valid.epub"};
        int result = epubChecker.processEpubFile(args);
        Assert.assertEquals(0, result);
    }

    @Test
    public void validateFileValidPathTest() {
        EpubChecker epubChecker = new EpubChecker();
        String path = "valid.epub";
        EPUBVersion version = EPUBVersion.VERSION_3;
        Report report = new Report() { // it will need a lot of configuration to be used
            //... fill the required methods
        };
        EPUBProfile profile = EPUBProfile.OPF_3_0;
        int result = epubChecker.validateFile(path, version, report, profile);
        Assert.assertEquals(0, result);
    }

    @Test
    public void validateFileInvalidPathTest() {
        EpubChecker epubChecker = new EpubChecker();
        String path = "invalid.epub";
        EPUBVersion version = EPUBVersion.VERSION_3;
        Report report = Mockito.mock(Report.class);
        EPUBProfile profile = EPUBProfile.OPF_3_0;
        int result = epubChecker.validateFile(path, version, report, profile);
        Assert.assertNotEquals(0, result);
    }

}