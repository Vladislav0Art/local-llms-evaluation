package com.adobe.epubcheck.tool;

import org.junit.Assert;
import org.junit.Test;

import java.util.Locale;

import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.util.DefaultReportImpl;
import com.adobe.epubcheck.util.EPUBVersion;

public class GeneratedProcessEpubFileWithValidArgsTest {

    @Test
    public void processEpubFileWithValidArgsTest() {
        EpubChecker epubChecker = new EpubChecker();
        String[] args = {"file.epub"};
        int result = epubChecker.processEpubFile(args);
        Assert.assertEquals(0, result);
    }

}