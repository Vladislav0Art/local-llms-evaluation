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

public class GeneratedProcessArgumentsTestForCorrectVersion {

    @Test
    public void processArgumentsTestForCorrectVersion() {
        EpubChecker epubChecker = new EpubChecker();
        String[] args = {"-v", "2"};

        boolean result = epubChecker.processArguments(args);

        Assert.assertTrue(result);
    }

}