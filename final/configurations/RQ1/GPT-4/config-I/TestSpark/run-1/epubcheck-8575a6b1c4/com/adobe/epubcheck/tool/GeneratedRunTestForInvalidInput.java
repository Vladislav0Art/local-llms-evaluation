package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.EpubCheck;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.EPUBVersion;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.File;
import java.io.IOException;

public class GeneratedRunTestForInvalidInput {

    @Test
    public void runTestForInvalidInput() throws IOException {
        EpubChecker epubChecker = new EpubChecker();
        String[] input = {"-invalidFlag", "test.epub"};

        int result = epubChecker.processEpubFile(input);

        Assert.assertEquals(1, result);
    }

}