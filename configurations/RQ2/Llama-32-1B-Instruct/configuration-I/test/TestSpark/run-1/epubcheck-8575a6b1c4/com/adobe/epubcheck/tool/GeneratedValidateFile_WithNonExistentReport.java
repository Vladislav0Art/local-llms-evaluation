package com.adobe.epubcheck.tool;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedValidateFile_WithNonExistentReport {

    @Test
    public void validateFile_WithNonExistentReport() {
        String path = "/path/to/file";
        when(ePubChecker.validateFile(path, EPUBVersion.VERSION_1, new Report(), null)).thenReturn(true);
        boolean result = epubChecker.validateFile(path, EPUBVersion.VERSION_1, new Report(), null);
        assertEquals(true, result);
    }

}