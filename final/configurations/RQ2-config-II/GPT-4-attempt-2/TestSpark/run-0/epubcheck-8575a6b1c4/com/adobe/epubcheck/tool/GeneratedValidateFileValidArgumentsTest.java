package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.util.DefaultReportImpl;
import org.junit.Assert;
import org.junit.Test;

import java.util.Locale;

public class GeneratedValidateFileValidArgumentsTest {

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