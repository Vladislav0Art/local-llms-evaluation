package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.EpubCheck;
import com.adobe.epubcheck.tool.EpubChecker;
import org.junit.Assert;
import org.junit.Test;

import java.util.Locale;

public class GeneratedValidateFileValidPathTest {

    @Test
    public void validateFileValidPathTest() {
        EpubChecker epubChecker = new EpubChecker();
        int result = epubChecker.validateFile("valid.epub", null, null, null);
        Assert.assertEquals(0, result);
    }

}