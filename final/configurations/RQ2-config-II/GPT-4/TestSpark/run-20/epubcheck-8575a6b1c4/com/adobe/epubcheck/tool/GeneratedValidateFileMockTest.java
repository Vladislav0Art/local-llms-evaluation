package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.EpubCheckFactory;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.DefaultReportImpl;
import com.adobe.epubcheck.util.EPUBVersion;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Locale;

public class GeneratedValidateFileMockTest {

    @Test
    public void validateFileMockTest() {
        EpubChecker checker = new EpubChecker();
        Report mockReport = Mockito.mock(Report.class);
        int validationResult = checker.validateFile("test.epub", EPUBVersion.VERSION_3, mockReport, EpubCheckFactory.profileFor("3.0"));
        Mockito.verify(mockReport, Mockito.times(1)).initialize("test.epub");
    }

}