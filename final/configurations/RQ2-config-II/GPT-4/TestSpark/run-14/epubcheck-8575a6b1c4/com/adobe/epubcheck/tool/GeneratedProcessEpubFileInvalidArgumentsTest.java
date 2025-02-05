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

public class GeneratedProcessEpubFileInvalidArgumentsTest {

    @Test
    public void processEpubFileInvalidArgumentsTest() {
        EpubChecker checker = new EpubChecker();
        int exitCode = checker.processEpubFile(new String[]{});
        Assert.assertEquals("Without arguments, processEpubFile() should return 1", 1, exitCode);
    }

}