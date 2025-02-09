package com.adobe.epubcheck.tool;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Locale;

import org.junit.Test;
import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.util.DefaultReportImpl;
import com.adobe.epubcheck.util.EPUBVersion;

public class GeneratedValidateFileInvalidVersionTest {

    @Test
    public void validateFileInvalidVersionTest() {
        EpubChecker epubChecker = new EpubChecker();
        Report report = new DefaultReportImpl("sampleInvalid.epub");
        int result = epubChecker.validateFile("sampleInvalid.epub", EPUBVersion.VERSION_UNDEFINED, report, EPUBProfile.OPF_2007_1);
        assertEquals("Should return error code", 1, result);
        assertTrue("Should have errors", report.hasErrors());
    }

}