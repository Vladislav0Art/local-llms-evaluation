package com.adobe.epubcheck.tool;

import org.junit.Assert;
import org.junit.Test;

import java.util.Locale;

import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.util.DefaultReportImpl;
import com.adobe.epubcheck.util.EPUBVersion;

public class GeneratedProcessEpubFileWithInvalidArgsTest {

    @Test
    public void processEpubFileWithInvalidArgsTest() {
        EpubChecker epubChecker = new EpubChecker();
        String[] args = {};
        int result = epubChecker.processEpubFile(args);
        Assert.assertNotEquals(0, result);
    }

}