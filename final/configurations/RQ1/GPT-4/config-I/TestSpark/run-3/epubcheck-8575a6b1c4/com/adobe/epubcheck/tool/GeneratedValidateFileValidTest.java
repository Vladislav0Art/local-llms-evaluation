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

public class GeneratedValidateFileValidTest {

    @Mock
    Report reportMock;

    @Test
    public void validateFileValidTest() {
        EpubChecker instance = new EpubChecker();
        instance.report = reportMock;
        assertNotNull(instance.validateFile("valid/path/file.xhtml", EPUBVersion.VERSION_3, instance.report, EPUBProfile.DEFAULT));
    }

}