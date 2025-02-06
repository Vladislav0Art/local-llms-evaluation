package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedValidateFileWithInvalidVersion FileValidationTestWithInvalidVersion {

    @Test
    public void validateFileWithInvalidVersion

    FileValidationTestWithInvalidVersion() {
        String path = "path/to/file";
        EPUBVersion version = null;
        Report report = new DefaultReportImpl();
        EpubChecker check = new EpubChecker();
        InvalidVersionException expectedException = new InvalidVersionException();
        try {
            int result = check.validateFile(path, version, report, new EPUBProfile());
            fail("Expected exception not thrown");
        } catch (InvalidVersionException e) {
            assertEquals(expectedException.getMessage(), e.getMessage());
        }
    }

}