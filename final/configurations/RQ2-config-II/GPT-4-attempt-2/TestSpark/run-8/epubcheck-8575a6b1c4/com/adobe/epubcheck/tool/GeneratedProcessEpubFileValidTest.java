package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.util.Messages;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Locale;

public class GeneratedProcessEpubFileValidTest {

    @Test
    public void processEpubFileValidTest() {
        EpubChecker epubChecker = new EpubChecker();
        String[] args = {"valid.epub"};
        int result = epubChecker.processEpubFile(args);
        Assert.assertEquals(0, result);
    }

}