package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.EpubCheck;
import com.adobe.epubcheck.tool.EpubChecker;
import org.junit.Assert;
import org.junit.Test;

import java.util.Locale;

public class GeneratedProcessEpubFileEmptyArgsTest {

    @Test
    public void processEpubFileEmptyArgsTest() {
        EpubChecker epubChecker = new EpubChecker();
        int result = epubChecker.processEpubFile(new String[0]);
        Assert.assertEquals(0, result);
    }

}