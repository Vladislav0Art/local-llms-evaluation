package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedValidateFileInvalidVersion {

    @Test
    public void validateFileInvalidVersion() throws Exception {
        EpubChecker checker = new EpubChecker();
        String path = "path/to/file.epub";
        EPUBVersion version = EPUBVersion.V3_0;
        Report report = new DefaultReportImpl();
        int result = checker.validateFile(path, version, report, new EPUBProfile());
        assertTrue(result != 0);
    }

}