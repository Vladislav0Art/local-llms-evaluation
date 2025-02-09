package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.EPUBVersion;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;

import java.util.Locale;

public class GeneratedValidateFileTest {

    @Test
    public void validateFileTest() {
        EpubChecker epubChecker = new EpubChecker();
        String path = "test.epub";
        EPUBVersion version = EPUBVersion.VERSION_2;
        Report report = Mockito.mock(Report.class);
        EPUBProfile profile = EPUBProfile.OPF_2_0;

        when(report.getCheckingReport()).thenReturn(new CheckingReport("", ""));
        int expectedResult = 0;
        int actualResult = epubChecker.validateFile(path, version, report, profile);
        Assert.assertEquals("Validate file return value is incorrect", expectedResult, actualResult);
    }

}