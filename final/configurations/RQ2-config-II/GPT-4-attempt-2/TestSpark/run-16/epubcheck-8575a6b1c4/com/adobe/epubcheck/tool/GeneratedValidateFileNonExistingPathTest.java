package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.util.EPUBVersion;
import org.junit.Test;

import java.util.Locale;

import static org.junit.Assert.assertEquals;

public class GeneratedValidateFileNonExistingPathTest {

    @Test
    public void validateFileNonExistingPathTest() {
        EpubChecker epubChecker = new EpubChecker();
        Report report = new DefaultReportImpl("/non-existing-path", EPUBVersion.VERSION_3);
        int result = epubChecker.validateFile("/non-existing-path", EPUBVersion.VERSION_3, report, EPUBProfile.DEFAULT);
        assertEquals("Should return 1 for non-existing file", 1, result);
    }

}