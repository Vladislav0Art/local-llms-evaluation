package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedValidateFileInvalidEPUB {

    @Test
    public void validateFileInvalidEPUB() throws Exception {
        EpubChecker checker = new EpubChecker();
        String path = "invalid/epub";
        EPUBVersion version = EPUBVersion.V2_0;
        Report report = new DefaultReportImpl();
        int result = checker.validateFile(path, version, report, new EPUBProfile());
        assertTrue(result != 0);
    }

}