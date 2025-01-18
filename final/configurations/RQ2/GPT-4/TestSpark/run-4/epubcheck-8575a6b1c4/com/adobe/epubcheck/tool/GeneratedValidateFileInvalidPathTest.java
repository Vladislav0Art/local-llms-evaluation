package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.EpubCheck;
import com.adobe.epubcheck.tool.EpubChecker;
import org.junit.Assert;
import org.junit.Test;

import java.util.Locale;

public class GeneratedValidateFileInvalidPathTest {

    @Test
    public void validateFileInvalidPathTest() {
        EpubChecker epubChecker = new EpubChecker();
        int result = epubChecker.validateFile("invalidPath", null, null, null);
        Assert.assertEquals(1, result);
    }

}