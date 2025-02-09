package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedValidateFile_emptyPath testValidateFileEmptyPath {

    @Test
    public void validateFile_emptyPath

    testValidateFileEmptyPath() {
        String path = "";
        EPUBVersion version = EPUBVersion.EPUB3;
        Report report = new DefaultReportImpl();
        EpubChecker epubChecker = new EpubChecker();
        try {
            int result = epubChecker.validateFile(path, version, report, new EPUBProfile());
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertNotNull(e.getMessage());
        }
    }

}