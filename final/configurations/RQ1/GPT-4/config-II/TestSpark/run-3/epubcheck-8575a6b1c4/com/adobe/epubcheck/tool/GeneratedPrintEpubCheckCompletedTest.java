package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.LocalizableReport;
import com.adobe.epubcheck.util.Archive;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.util.ReportingLevel;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.File;

public class GeneratedPrintEpubCheckCompletedTest {

    @Test
    public void printEpubCheckCompletedTest() {
        EpubChecker checker = Mockito.spy(new EpubChecker());
        LocalizableReport report = Mockito.mock(LocalizableReport.class);
        Mockito.when(report.getFatalErrorCount()).thenReturn(0);
        Mockito.when(report.getErrorCount()).thenReturn(0);
        Mockito.when(report.getWarningCount()).thenReturn(0);
        Mockito.when(report.getInfoCount()).thenReturn(0);
        Mockito.when(report.getUsageCount()).thenReturn(0);
        checker.printEpubCheckCompleted(report);
        Mockito.verify(report, Mockito.times(1)).getFatalErrorCount();
    }

}