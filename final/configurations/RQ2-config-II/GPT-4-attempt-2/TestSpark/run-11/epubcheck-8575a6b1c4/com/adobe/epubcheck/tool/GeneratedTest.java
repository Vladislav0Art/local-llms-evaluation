package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.LocalizableReport;
import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.util.ReportingLevel;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;

import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void getLocaleTest() {
        EpubChecker checker = new EpubChecker();
        Assert.assertEquals(Locale.getDefault(), checker.getLocale());
    }

    @Test
    public void runIfArgsIsNullTest() {
        EpubChecker checker = new EpubChecker();
        String[] args = null;
        Assert.assertEquals(-1, checker.run(args));
    }

    @Test
    public void runIfArgsIsEmptyTest() {
        EpubChecker checker = new EpubChecker();
        String[] args = new String[]{};
        Assert.assertEquals(-1, checker.run(args));
    }

    @Test
    public void runIfArgsIsNotEmptyTest() {
        EpubChecker checker = new EpubChecker();
        String[] args = new String[]{"arg1", "arg2"};
        Assert.assertEquals(0, checker.run(args));
    }

    @Test
    public void processEpubFileIfArgsIsNullTest() {
        EpubChecker checker = new EpubChecker();
        String[] args = null;
        Assert.assertEquals(-1, checker.processEpubFile(args));
    }

    @Test
    public void processEpubFileIfArgsIsEmptyTest() {
        EpubChecker checker = new EpubChecker();
        String[] args = new String[]{};
        Assert.assertEquals(-1, checker.processEpubFile(args));
    }

    @Test
    public void processEpubFileIfArgsIsNotEmptyTest() {
        EpubChecker checker = new EpubChecker();
        String[] args = new String[]{"arg1", "arg2"};
        Assert.assertEquals(0, checker.processEpubFile(args));
    }

    @Test
    public void validateFileIfPathIsNullTest() {
        EpubChecker checker = new EpubChecker();
        String path = null;
        EPUBVersion version = EPUBVersion.VERSION_3;
        LocalizableReport report = mock(LocalizableReport.class);
        EPUBProfile profile = EPUBProfile.DEFAULT;

        Assert.assertEquals(0, checker.validateFile(path, version, report, profile));
    }

    @Test
    public void validateFileIfPathIsNotEmptyTest() {
        EpubChecker checker = new EpubChecker();
        String path = "testPath";
        EPUBVersion version = EPUBVersion.VERSION_3;
        LocalizableReport report = mock(LocalizableReport.class);
        EPUBProfile profile = EPUBProfile.DEFAULT;

        Assert.assertEquals(1, checker.validateFile(path, version, report, profile));
    }

}