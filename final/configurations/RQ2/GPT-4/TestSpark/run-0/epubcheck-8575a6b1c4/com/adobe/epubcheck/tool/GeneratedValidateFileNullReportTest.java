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

public class GeneratedValidateFileNullReportTest {

    @Test
    public void validateFileNullReportTest() {
        EpubChecker checker = new EpubChecker();
        int result = checker.validateFile("validPath", EPUBVersion.VERSION_2, null, EPUBProfile.DEFAULT);

        assertEquals("Exit code should be 1 for null report", 1, result);
    }

}