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
    public void getLocaleDefaultTest() {
        EpubChecker checker = new EpubChecker();
        Locale expectedLocale = Locale.getDefault();
        Locale actualLocale = checker.getLocale();
        Assert.assertEquals(expectedLocale, actualLocale);
    }

    @Test
    public void runNullArgumentsTest() {
        EpubChecker checker = new EpubChecker();
        checker.run(null);
    }

    @Test
    public void runEmptyArgumentsTest() {
        EpubChecker checker = new EpubChecker();
        int expected = 0;
        int actual = checker.run(new String[]{});
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void processEpubFileNullArgumentsTest() {
        EpubChecker checker = new EpubChecker();
        checker.processEpubFile(null);
    }

    @Test
    public void processEpubFileEmptyArgumentsTest() {
        EpubChecker checker = new EpubChecker();
        int expected = 0;
        int actual = checker.processEpubFile(new String[]{});
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void validateFileNullArgumentsTest() {
        EpubChecker checker = new EpubChecker();
        checker.validateFile(null, null, null, null);
    }

    @Test
    public void validateFileValidArgumentsTest() {
        EpubChecker checker = new EpubChecker();
        String path = "test.epub";
        EPUBVersion version = EPUBVersion.VERSION_3;
        Report report = new DefaultReportImpl(path);
        EPUBProfile profile = EPUBProfile.DEFAULT;
        int actual = checker.validateFile(path, version, report, profile);
        Assert.assertEquals(0, actual);
    }

}