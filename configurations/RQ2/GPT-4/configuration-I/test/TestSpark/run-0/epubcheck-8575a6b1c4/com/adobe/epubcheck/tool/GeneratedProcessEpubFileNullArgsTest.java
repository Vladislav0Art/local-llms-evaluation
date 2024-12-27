package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.tool.EpubChecker;
import org.junit.Assert;
import org.junit.Test;

import java.util.Locale;

import org.mockito.Mockito;
import com.adobe.epubcheck.epub.EPUBProfile;
import com.adobe.epubcheck.epub.EPUBVersion;

public class GeneratedProcessEpubFileNullArgsTest {

    @Test
    public void processEpubFileNullArgsTest() {
        EpubChecker checker = new EpubChecker();
        int result = checker.processEpubFile(null);
        Assert.assertEquals(-1, result);
    }

}