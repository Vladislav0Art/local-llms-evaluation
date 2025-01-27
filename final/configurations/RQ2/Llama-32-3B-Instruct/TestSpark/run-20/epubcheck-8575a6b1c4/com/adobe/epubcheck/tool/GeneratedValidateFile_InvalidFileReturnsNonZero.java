package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

public class GeneratedValidateFile_InvalidFileReturnsNonZero {

    @Test
    public void validateFile_InvalidFileReturnsNonZero() {
        EpubChecker checker = new EpubChecker();
        when(checker.processEpubFile("test.zip", new String[]{"--validate"})).thenReturn(-1);
        int result = checker.validateFile("test.zip", EPUBVersion.EPUB30, new Report(), new EPUBProfile());
        assertEquals(-1, result);
    }

}