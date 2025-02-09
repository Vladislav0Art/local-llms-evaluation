package com.adobe.epubcheck.tool;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import java.io.File;
import java.util.Locale;

import org.junit.Test;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.util.EPUBVersion;

public class GeneratedValidateFileTest {

    @Test
    public void validateFileTest() {
        String fileType = "pdf";
        EPUBVersion version = EPUBVersion.VERSION_2;

        Report mockReport = mock(Report.class);
        EpubChecker epubChecker = new EpubChecker();
        int result = epubChecker.validateFile(fileType, version, mockReport, null);
        assertEquals(-1, result);
    }

}