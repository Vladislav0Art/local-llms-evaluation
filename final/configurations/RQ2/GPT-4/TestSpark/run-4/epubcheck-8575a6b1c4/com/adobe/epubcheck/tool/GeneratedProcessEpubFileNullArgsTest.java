package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.EpubCheck;
import com.adobe.epubcheck.tool.EpubChecker;
import org.junit.Assert;
import org.junit.Test;

import java.util.Locale;

public class GeneratedProcessEpubFileNullArgsTest {

    @Test
    public void processEpubFileNullArgsTest() {
        EpubChecker epubChecker = new EpubChecker();
        int result = epubChecker.processEpubFile(null);
        Assert.assertEquals(1, result);
    }

}