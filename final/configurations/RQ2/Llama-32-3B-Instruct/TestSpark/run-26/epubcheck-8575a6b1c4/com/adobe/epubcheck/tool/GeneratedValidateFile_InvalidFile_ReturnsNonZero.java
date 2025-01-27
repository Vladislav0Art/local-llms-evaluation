package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedValidateFile_InvalidFile_ReturnsNonZero {

    @Test
    public void validateFile_InvalidFile_ReturnsNonZero() {
        File file = new File("invalid.epub");
        EpubChecker checker = new EpubChecker();
        int result = checker.validateFile(file.toURI(), EPUBVersion.EPB3, null, null);
        assertNotEquals(0, result); // assumes default behavior throws an exception
    }

}