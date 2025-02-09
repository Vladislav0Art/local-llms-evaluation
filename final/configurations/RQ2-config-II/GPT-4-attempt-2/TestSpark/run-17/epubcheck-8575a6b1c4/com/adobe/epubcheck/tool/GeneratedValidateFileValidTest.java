package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.util.DefaultReportImpl;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Locale;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedValidateFileValidTest {

    @Mock
    private Report report;

    @Test
    public void validateFileValidTest() {
        MockitoAnnotations.initMocks(this);
        String validPath = "valid_path";
        Report validReport = new DefaultReportImpl(validPath, false, EPUBVersion.VERSION_3);
        EPUBProfile validProfile = EPUBProfile.DEFAULT;
        EpubChecker checker = new EpubChecker();
        int result = checker.validateFile(validPath, EPUBVersion.VERSION_3, validReport, validProfile);
        assertEquals(0, result);
    }

}