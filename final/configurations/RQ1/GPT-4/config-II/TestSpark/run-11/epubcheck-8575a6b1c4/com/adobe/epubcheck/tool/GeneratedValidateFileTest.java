package com.adobe.epubcheck.tool;

import static org.mockito.Mockito.*;

import org.junit.Assert;
import org.junit.Test;
import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.api.Report;

public class GeneratedValidateFileTest {

    @Test
    public void validateFileTest() {
        EpubChecker epubChecker = new EpubChecker();
        Report reportMock = mock(Report.class);
        when(reportMock.getFatalErrorCount()).thenReturn(0);
        int result = epubChecker.validateFile("test-file", EPUBVersion.VERSION_3, reportMock, EPUBProfile.DEFAULT);
        Assert.assertNotEquals(-1, result);
        verify(reportMock).getFatalErrorCount();
    }

}