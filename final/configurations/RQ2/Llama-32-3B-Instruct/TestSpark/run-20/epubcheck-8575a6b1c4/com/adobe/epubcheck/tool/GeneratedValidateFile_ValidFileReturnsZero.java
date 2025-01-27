package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

public class GeneratedValidateFile_ValidFileReturnsZero {

    @Test
    public void validateFile_ValidFileReturnsZero() {
        EpubChecker checker = new EpubChecker();
        when(checker.processEpubFile("test.zip", new String[]{"--validate"})).thenReturn(0);
        int result = checker.validateFile("test.zip", EPUBVersion.EPUB30, new Report(), new EPUBProfile());
        assertEquals(0, result);
    }

}