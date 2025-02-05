package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.EpubCheck;
import com.adobe.epubcheck.api.LocalizableReport;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.util.FileResourceProvider;
import com.adobe.epubcheck.util.GenericResourceProvider;
import com.adobe.epubcheck.util.TestReportImpl;
import com.adobe.epubcheck.util.URLResourceProvider;
import org.junit.Test;

import java.util.Arrays;
import java.util.Locale;

import org.junit.Assert;

public class GeneratedTest {

    @Test
    public void getLocaleDefaultLocaleTest() {
        EpubChecker checker = new EpubChecker();
        Assert.assertEquals("Default locale should be US", Locale.US, checker.getLocale());
    }

    @Test
    public void runNoArgumentsTest() {
        EpubChecker checker = new EpubChecker();
        int exitCode = checker.run(new String[]{});
        Assert.assertEquals("Without arguments, run() should return 1", 1, exitCode);
    }

    @Test
    public void processEpubFileInvalidArgumentsTest() {
        EpubChecker checker = new EpubChecker();
        int exitCode = checker.processEpubFile(new String[]{});
        Assert.assertEquals("Without arguments, processEpubFile() should return 1", 1, exitCode);
    }

    @Test
    public void validateFileAllArgumentsValidTest() {
        String path = "test.epub";
        EPUBVersion version = EPUBVersion.VERSION_3;
        Report report = new TestReportImpl();
        EPUBProfile profile = EPUBProfile.DEFAULT;

        EpubChecker checker = new EpubChecker();
        int exitCode = checker.validateFile(path, version, report, profile);
        Assert.assertEquals("With valid arguments, validateFile() should return 0", 0, exitCode);
    }

}