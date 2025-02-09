package com.adobe.epubcheck.tool;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import java.io.File;
import java.util.Locale;

import org.junit.Test;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.util.EPUBVersion;

public class GeneratedValidateFileNullVersionTest {

    @Test
    public void validateFileNullVersionTest() {
        String fileType = "pdf";
        EPUBVersion version = null;
        Report mockReport = mock(Report.class);
        EpubChecker epubChecker = new EpubChecker();
        epubChecker.validateFile(fileType, version, mockReport, null);
    }

}