package com.adobe.epubcheck.tool;

import org.junit.Assert;
import org.junit.Test;

import java.util.Locale;

import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.util.DefaultReportImpl;
import com.adobe.epubcheck.util.EPUBVersion;

public class GeneratedValidateFileWithInvalidArgsTest {

    @Test
    public void validateFileWithInvalidArgsTest() {
        EpubChecker epubChecker = new EpubChecker();
        String path = "";
        EPUBVersion version = EPUBVersion.VERSION_3;
        DefaultReportImpl report = new DefaultReportImpl(path);
        EPUBProfile profile = EPUBProfile.DEFAULT;
        int result = epubChecker.validateFile(path, version, report, profile);
        Assert.assertNotEquals(0, result);
    }

}