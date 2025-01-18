package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.util.DefaultReportImpl;
import org.junit.Assert;
import org.junit.Test;

import java.util.Locale;

public class GeneratedValidateFileTestWithNullProfile {

    @Test
    public void validateFileTestWithNullProfile() {
        EpubChecker epubChecker = new EpubChecker();
        EPUBVersion version = EPUBVersion.VERSION_2;
        Report report = new DefaultReportImpl("testPath");
        int result = epubChecker.validateFile("testPath", version, report, null);
        Assert.assertEquals(-1, result);
    }

}