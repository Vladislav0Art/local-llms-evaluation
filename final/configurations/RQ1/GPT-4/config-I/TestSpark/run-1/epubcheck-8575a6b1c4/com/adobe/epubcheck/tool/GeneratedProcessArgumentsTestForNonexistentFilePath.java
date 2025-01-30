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

public class GeneratedProcessArgumentsTestForNonexistentFilePath {

    @Test
    public void processArgumentsTestForNonexistentFilePath() {
        EpubChecker epubChecker = new EpubChecker();
        File file = new File("nonexistent");
        String[] args = {file.getAbsolutePath()};

        boolean result = epubChecker.processArguments(args);

        Assert.assertFalse(result);
    }

}