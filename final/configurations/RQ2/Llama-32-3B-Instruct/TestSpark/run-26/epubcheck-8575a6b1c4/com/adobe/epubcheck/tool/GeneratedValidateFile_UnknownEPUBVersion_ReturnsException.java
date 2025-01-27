package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedValidateFile_UnknownEPUBVersion_ReturnsException {

    @Test
    public void validateFile_UnknownEPUBVersion_ReturnsException() {
        File file = new File("valid.epub");
        EpubChecker checker = new EpubChecker();
        try {
            int result = checker.validateFile(file.toURI(), EPUBVersion.EPB4, null, null);
            fail("Expected InvalidVersionException");
        } catch (InvalidVersionException e) {
            // expected exception
        }
    }

}