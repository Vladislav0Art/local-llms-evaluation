package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.util.DefaultReportImpl;
import org.junit.Test;

import java.util.Locale;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedValidateFileEmptyPathTest {

    @Test
    public void validateFileEmptyPathTest() {
        EpubChecker checker = new EpubChecker();
        Report report = new DefaultReportImpl("validPath", "validPath", false);
        int result = checker.validateFile("", EPUBVersion.VERSION_2, report, EPUBProfile.DEFAULT);

        assertEquals("Exit code should be 1 for empty path", 1, result);
    }

}