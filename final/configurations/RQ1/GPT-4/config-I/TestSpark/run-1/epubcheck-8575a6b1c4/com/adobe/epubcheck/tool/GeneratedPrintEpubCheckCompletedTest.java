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

public class GeneratedPrintEpubCheckCompletedTest {

    @Test
    public void printEpubCheckCompletedTest() {
        EpubChecker epubChecker = new EpubChecker();
        epubChecker.printEpubCheckCompleted(new ReportStub());
    }

}