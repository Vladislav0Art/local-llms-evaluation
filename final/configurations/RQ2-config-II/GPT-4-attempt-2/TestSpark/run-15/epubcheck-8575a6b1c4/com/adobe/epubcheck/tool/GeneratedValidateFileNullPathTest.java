package com.adobe.epubcheck.tool;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import java.io.File;
import java.util.Locale;

import org.junit.Test;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.util.EPUBVersion;

public class GeneratedValidateFileNullPathTest {

    @Test
    public void validateFileNullPathTest() {
        String fileType = null;
        EPUBVersion version = EPUBVersion.VERSION_2;
        Report mockReport = mock(Report.class);
        EpubChecker epubChecker = new EpubChecker();
        epubChecker.validateFile(fileType, version, mockReport, null);
    }

}