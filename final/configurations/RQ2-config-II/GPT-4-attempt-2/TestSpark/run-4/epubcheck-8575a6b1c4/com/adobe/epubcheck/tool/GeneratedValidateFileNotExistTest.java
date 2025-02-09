package com.adobe.epubcheck.tool;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;

import org.junit.Test;

import java.util.Locale;

import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.util.DefaultReportImpl;
import com.adobe.epubcheck.util.EPUBVersion;

public class GeneratedValidateFileNotExistTest {

    @Test
    public void validateFileNotExistTest() {
        EpubChecker epubChecker = new EpubChecker();
        Report report = new DefaultReportImpl("test.epub");
        int result = epubChecker.validateFile("testNotExist.epub", EPUBVersion.VERSION_3, report, EPUBProfile.DEFAULT);
        assertEquals(5, result);
    }

}