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

public class GeneratedProcessEpubFileInvalidTest {

    @Test
    public void processEpubFileInvalidTest() {
        EpubChecker epubChecker = new EpubChecker();
        String[] args = {"invalid.epub"};
        int result = epubChecker.processEpubFile(args);
        Assert.assertEquals(1, result);
    }

}