package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.tool.EpubChecker;
import org.junit.Assert;
import org.junit.Test;

import java.util.Locale;

import org.mockito.Mockito;
import com.adobe.epubcheck.epub.EPUBProfile;
import com.adobe.epubcheck.epub.EPUBVersion;

public class GeneratedRunNullArgsTest {

    @Test
    public void runNullArgsTest() {
        EpubChecker checker = new EpubChecker();
        int result = checker.run(null);
        Assert.assertEquals(-1, result);
    }

}