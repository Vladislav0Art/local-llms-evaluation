package com.adobe.epubcheck.tool;

import static org.junit.Assert.*;

import org.junit.Test;
import com.adobe.epubcheck.tool.EpubChecker;

import static org.mockito.Mockito.*;

import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.util.DefaultReportImpl;
import com.adobe.epubcheck.util.EPUBVersion;
import org.mockito.Mock;

import java.util.Locale;

public class GeneratedValidateFileInValidTest {

    @Mock
    Report reportMock;

    @Test
    public void validateFileInValidTest() {
        EpubChecker instance = new EpubChecker();
        instance.report = reportMock;
        when(reportMock.getWarningCount()).thenReturn(1);
        assertNotNull(instance.validateFile("invalid/path/file.xhtml", EPUBVersion.VERSION_3, instance.report, EPUBProfile.DEFAULT));
    }

}