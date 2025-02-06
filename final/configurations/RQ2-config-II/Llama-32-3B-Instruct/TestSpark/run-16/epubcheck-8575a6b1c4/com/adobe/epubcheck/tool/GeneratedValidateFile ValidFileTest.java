package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedValidateFile ValidFileTest {

    @Test
    public void validateFile

    ValidFileTest() {
        EpubChecker epubChecker = new EpubChecker();
        String path = "input.ebook";
        EPUBVersion version = new EPUBVersion("2.0");
        Report report = new DefaultReportImpl();
        EPUBProfile profile = new EPUBProfile();

        // Check if validateFile returns the correct result
        int result = (int) epubChecker.validateFile(path, version, report, profile);
        assertTrue(result == 0);
    }

}