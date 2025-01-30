package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.EpubCheck;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.api.EpubCheckFactory;
import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.util.ReportStub;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedRunTestFail {

    @Test
    public void runTestFail() {
        String[] args = new String[1];
        args[0] = "invalid.epub";
        EpubChecker checker = new EpubChecker();
        int result = checker.run(args);
        Assert.assertNotEquals(0, result);
    }

}