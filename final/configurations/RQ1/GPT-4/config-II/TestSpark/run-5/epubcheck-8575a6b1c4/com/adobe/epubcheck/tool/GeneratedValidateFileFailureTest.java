package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.util.Messages;
import org.junit.Test;

import java.io.File;
import java.util.Locale;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class GeneratedValidateFileFailureTest {

    @Test
    public void validateFileFailureTest() {
        EpubChecker epubChecker = new EpubChecker();
        String path = "invalid/path";
        Report report = new DefaultReportImpl(path);
        try {
            epubChecker.validateFile(path, EPUBVersion.VERSION_3, report,
                    EPUBProfile.DEFAULT);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            assertNotNull(e);
        }
    }

}