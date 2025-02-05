package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.EpubCheck;
import com.adobe.epubcheck.api.LocalizableReport;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.DefaultReportImpl;
import com.adobe.epubcheck.util.EPUBVersion;
import io.mola.galimatias.URL;
import org.junit.Test;

import java.util.Locale;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class GeneratedValidateFileNoPathTest {

    @Test
    public void validateFileNoPathTest() {
        EpubChecker epubChecker = new EpubChecker();
        Report report = mock(Report.class);
        assertEquals(1, epubChecker.validateFile("", EPUBVersion.VERSION_2, report, EPUBProfile.DEFAULT));
        verify(report).message(null, 0, 0, "No file to process.");
    }

}