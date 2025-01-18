package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.api.Report;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Locale;

import static org.junit.Assert.*;

public class GeneratedValidateFileTest {

    @Test
    public void validateFileTest() {
        EpubChecker epubChecker = Mockito.spy(EpubChecker.class);
        Report mockReport = Mockito.mock(Report.class);
        String path = "path";
        EPUBVersion version = EPUBVersion.VERSION_2;
        int result = epubChecker.validateFile(path, version, mockReport, null);
        assertEquals(0, result);
    }

}