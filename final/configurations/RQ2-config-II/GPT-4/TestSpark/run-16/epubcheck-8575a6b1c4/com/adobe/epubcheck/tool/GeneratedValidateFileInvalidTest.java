package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.util.DefaultReportImpl;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Locale;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class GeneratedValidateFileInvalidTest {

    @Test
    public void validateFileInvalidTest() {
        EpubChecker epubChecker = new EpubChecker();
        Report report = Mockito.mock(DefaultReportImpl.class);
        int result = epubChecker.validateFile("nonexistent.epub", EPUBVersion.VERSION_3, report, EPUBProfile.DEFAULT);
        assertEquals(1, result);
        verify(report, times(1)).error(anyString(), anyString());
    }

}