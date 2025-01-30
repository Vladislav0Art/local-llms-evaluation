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

public class GeneratedRunTestForValidInput {

    @Test
    public void runTestForValidInput() throws IOException {
        EpubChecker epubChecker = new EpubChecker();
        String[] input = {"-v", "3", "validTestFile.epub"};

        Report report = Mockito.spy(Report.class);
        Mockito.when(report.getErrorCount()).thenReturn(0);
        Mockito.when(report.getFatalErrorCount()).thenReturn(0);

        int result = epubChecker.processEpubFile(input);

        Mockito.verify(report, Mockito.atLeastOnce()).initialize();
        Mockito.verify(report, Mockito.atLeastOnce()).generate();

        Assert.assertEquals(0, result);
    }

}