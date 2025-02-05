package com.adobe.epubcheck.tool;

import org.junit.Test;

import java.util.Locale;

import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.api.EPUBProfile;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedValidateFileTest {


    private final EpubChecker epubChecker = new EpubChecker();

    @Test
    public void validateFileTest() {
        final String path = "path/to/file.txt";
        final EPUBVersion version = EPUBVersion.VERSION_2;
        final Report report = mock(Report.class);
        final EPUBProfile profile = EPUBProfile.DEFAULT;

        assertEquals(0, epubChecker.validateFile(path, version, report, profile));

        verify(report, times(1)).info(path, 0, "VALID");
    }

}