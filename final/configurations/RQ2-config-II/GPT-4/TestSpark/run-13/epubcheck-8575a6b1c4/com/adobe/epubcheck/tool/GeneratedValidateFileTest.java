package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.util.EPUBVersion;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Locale;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedValidateFileTest {

    @Test
    public void validateFileTest() {
        String path = "filename.epub";
        EPUBVersion version = EPUBVersion.VERSION_3;
        Report report = Mockito.mock(Report.class);
        EPUBProfile profile = EPUBProfile.DEFAULT;

        EpubChecker epubChecker = new EpubChecker();
        int result = epubChecker.validateFile(path, version, report, profile);

        assertEquals(1, result);
        verify(report, times(1)).info(path, 0, "file_checked");
    }

}