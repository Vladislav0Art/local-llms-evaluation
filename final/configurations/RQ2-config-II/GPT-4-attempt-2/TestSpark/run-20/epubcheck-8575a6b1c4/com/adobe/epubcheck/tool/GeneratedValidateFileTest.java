package com.adobe.epubcheck.tool;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Locale;

import org.junit.Test;
import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.util.EPUBVersion;

public class GeneratedValidateFileTest {

    @Test
    public void validateFileTest() {
        String path = "/path/to/file";
        EPUBVersion version = EPUBVersion.VERSION_3;
        Report report = mock(Report.class);
        EPUBProfile profile = EPUBProfile.DEFAULT;

        EpubChecker checker = new EpubChecker();
        int result = checker.validateFile(path, version, report, profile);

        verify(report, times(1)).initialize();
        assertTrue("Validate file should return non-negative int", result >= 0);
    }

}