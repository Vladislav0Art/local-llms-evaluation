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

public class GeneratedValidateFileValidTest {

    @Test
    public void validateFileValidTest() {
        EpubChecker epubChecker = new EpubChecker();
        Report report = mock(DefaultReportImpl.class);
        int result = epubChecker.validateFile("validTest.epub", EPUBVersion.VERSION_3, report, EPUBProfile.DEFAULT);
        // the result may vary based on the properties of "validTest.epub", so adjust this testcase accordingly
        assertEquals(0, result);
    }

}