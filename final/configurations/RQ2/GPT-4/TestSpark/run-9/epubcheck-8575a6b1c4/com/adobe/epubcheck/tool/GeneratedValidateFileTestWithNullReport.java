package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.util.DefaultReportImpl;
import org.junit.Assert;
import org.junit.Test;

import java.util.Locale;

public class GeneratedValidateFileTestWithNullReport {

    @Test
    public void validateFileTestWithNullReport() {
        EpubChecker epubChecker = new EpubChecker();
        EPUBVersion version = EPUBVersion.VERSION_2;
        EPUBProfile profile = EPUBProfile.DEFAULT;
        int result = epubChecker.validateFile("testPath", version, null, profile);
        Assert.assertEquals(-1, result);
    }

}