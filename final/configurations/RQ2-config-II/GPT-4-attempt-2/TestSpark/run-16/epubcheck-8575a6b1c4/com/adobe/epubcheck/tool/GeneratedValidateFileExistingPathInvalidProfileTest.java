package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.util.EPUBVersion;
import org.junit.Test;

import java.util.Locale;

import static org.junit.Assert.assertEquals;

public class GeneratedValidateFileExistingPathInvalidProfileTest {

    @Test
    public void validateFileExistingPathInvalidProfileTest() {
        EpubChecker epubChecker = new EpubChecker();
        Report report = new DefaultReportImpl(getClass().getResource("/valid.epub").getPath(), EPUBVersion.VERSION_3);
        int result = epubChecker.validateFile(getClass().getResource("/valid.epub").getPath(), EPUBVersion.VERSION_3, report, null);
        assertEquals("Should return 1 for a null profile", 1, result);
    }

}