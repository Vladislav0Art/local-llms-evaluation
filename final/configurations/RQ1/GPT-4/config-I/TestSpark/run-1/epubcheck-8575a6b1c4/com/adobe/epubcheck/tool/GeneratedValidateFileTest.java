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

public class GeneratedValidateFileTest {

    @Test
    public void validateFileTest() {
        Report expected = new ReportStub();
        String path = "test.epub";
        EpubChecker checker = new EpubChecker();
        EpubCheckFactory mockFactory = mock(EpubCheckFactory.class);
        EpubCheck mockCheck = mock(EpubCheck.class);
        when(mockFactory.newInstance(any())).thenReturn(mockCheck);
        when(mockCheck.doValidate()).thenReturn(0);
        int result = checker.validateFile(path, EPUBVersion.VERSION_3, expected, null);
        Assert.assertEquals(0, result);
    }

}