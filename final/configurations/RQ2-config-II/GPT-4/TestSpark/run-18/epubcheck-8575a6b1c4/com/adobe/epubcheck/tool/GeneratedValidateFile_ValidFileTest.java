package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.util.DefaultReportImpl;
import org.junit.Test;

import java.util.Locale;

import static org.junit.Assert.assertEquals;

public class GeneratedValidateFile_ValidFileTest {

    @Test
    public void validateFile_ValidFileTest() {
        EpubChecker epubChecker = new EpubChecker();
        String validPath = "test.epub";
        Report report = new DefaultReportImpl(validPath);
        int result = epubChecker.validateFile(validPath, EPUBVersion.VERSION_3_0, report, EPUBProfile.DEFAULT);
        assertEquals(0, result);
    }

}