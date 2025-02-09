package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedValidateFile_invalidVersion testValidateFileInvalidVersion {

    @Test
    public void validateFile_invalidVersion

    testValidateFileInvalidVersion() {
        String path = "/path/to/file";
        EPUBVersion version = EPUBVersion.EPUB4;
        Report report = new DefaultReportImpl();
        EpubChecker epubChecker = new EpubChecker();
        try {
            int result = epubChecker.validateFile(path, version, report, new EPUBProfile());
            fail("Expected InvalidVersionException");
        } catch (InvalidVersionException e) {
            assertNotNull(e.getMessage());
        }
    }

}