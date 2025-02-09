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

public class GeneratedValidateFileValidPathTest {

    @Test
    public void validateFileValidPathTest() {
        EpubChecker epubChecker = new EpubChecker();
        Report report = new DefaultReportImpl("sample.epub");
        int result = epubChecker.validateFile("sample.epub", EPUBVersion.VERSION_3, report, EPUBProfile.OPF_2007_1);
        assertEquals("Should return success code", 0, result);
        assertFalse("Should not have warnings", report.hasWarnings());
        assertFalse("Should not have errors", report.hasErrors());
    }

}