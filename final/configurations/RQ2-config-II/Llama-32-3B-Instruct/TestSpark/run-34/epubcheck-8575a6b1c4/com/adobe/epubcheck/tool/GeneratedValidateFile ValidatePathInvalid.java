package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedValidateFile ValidatePathInvalid {

    @Test
    public void validateFile

    ValidatePathInvalid() throws Exception {
        File file = new File("path/to/invalid.epub");
        EPUBVersion version = EPUBVersion.V40;
        Report report = new DefaultReportImpl();
        EpubChecker epubChecker = new EpubChecker();
        int result = epubChecker.validateFile(file.getAbsolutePath(), version, report, null);
        assertEquals(1, result);
    }

}