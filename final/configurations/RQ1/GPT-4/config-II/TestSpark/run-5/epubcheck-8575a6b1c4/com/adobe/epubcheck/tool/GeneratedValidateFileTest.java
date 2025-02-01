package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.util.Messages;
import org.junit.Test;

import java.io.File;
import java.util.Locale;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class GeneratedValidateFileTest {

    @Test
    public void validateFileTest() {
        EpubChecker epubChecker = new EpubChecker();
        String path = ""; // add suitable file path here
        Report report = new DefaultReportImpl(path);
        int result = epubChecker.validateFile(path, EPUBVersion.VERSION_3, report,
                EPUBProfile.DEFAULT);
        assertEquals(0, result);
    }

}