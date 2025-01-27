package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedValidateFile_ValidFile_ReturnsZero {

    @Test
    public void validateFile_ValidFile_ReturnsZero() {
        File file = new File("valid.epub");
        EpubChecker checker = new EpubChecker();
        int result = checker.validateFile(file.toURI(), EPUBVersion.EPB3, null, null);
        assertEquals(0, result);
    }

}