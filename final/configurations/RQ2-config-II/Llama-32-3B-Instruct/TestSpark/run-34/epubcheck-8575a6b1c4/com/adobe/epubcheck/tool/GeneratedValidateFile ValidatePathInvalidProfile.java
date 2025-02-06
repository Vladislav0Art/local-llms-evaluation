package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedValidateFile ValidatePathInvalidProfile {

    @Test
    public void validateFile

    ValidatePathInvalidProfile() throws Exception {
        File file = new File("path/to/valid.epub");
        EPUBVersion version = EPUBVersion.V40;
        Report report = new DefaultReportImpl();
        EpubChecker epubChecker = new EpubChecker();
        int result = epubChecker.validateFile(file.getAbsolutePath(), version, report, "invalid-profile");
        assertEquals(1, result);
    }

}